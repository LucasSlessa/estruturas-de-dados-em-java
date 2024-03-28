package listaligada;

class ListaLigadaDuplamente {
    private Celula primeira;
    private Celula ultima;
    private int total;

    public ListaLigadaDuplamente() {
        this.primeira = null;
        this.ultima = null;
        this.total = 0;
    }

    public void adiciona(Object elemento) {
        Celula nova = new Celula(elemento, ultima, null);
        if (total == 0) {
            primeira = nova;
        } else {
            ultima.setProxima(nova);
        }
        ultima = nova;
        total++;
    }

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, null, primeira);
        if (total == 0) {
            ultima = nova;
        } else {
            primeira.setAnterior(nova);
        }
        primeira = nova;
        total++;
    }

    public int tamanho() {
        return total;
    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        return atual;
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        primeira = primeira.getProxima();
        if (primeira != null) {
            primeira.setAnterior(null);
        } else {
            ultima = null;
        }
        total--;
    }

    //adciona em qualquer lugar

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.total) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(elemento, anterior, proxima);
            anterior.setProxima(nova);
            if (proxima != null) {
                proxima.setAnterior(nova);
            } else {
                ultima = nova;
            }
            this.total = this.total + 1;
        }
    }

    //remove do fim

    public void removeDoFim() {
        if (!posicaoOcupada(total - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (total == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            this.ultima = penultima;
            this.ultima.setProxima(null);
            total = total - 1;
        }
    }

    //remove qualquer posição

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (posicao == 0) {
            this.removeDoComeco();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            if (proxima != null) {
                proxima.setAnterior(anterior);
            } else {
                ultima = anterior;
            }
            total = total - 1;
        }
    }

    @Override
    public String toString() {
        if (total == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        while (atual != null) {
            builder.append(atual.getElemento());
            if (atual.getProxima() != null) {
                builder.append(", ");
            }
            atual = atual.getProxima();
        }
        builder.append("]");
        return builder.toString();
    }
}
