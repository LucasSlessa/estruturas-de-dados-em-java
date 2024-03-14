package listaligada;


class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int total;

    public ListaLigada() {
        this.primeira = null;
        this.ultima = null;
        this.total = 0;
    }

    public void adiciona(Object elemento) {
        Celula nova = new Celula(elemento);
        if (total == 0) {
            primeira = nova;
        } else {
            ultima.setProxima(nova);
        }
        ultima = nova;
        total++;
    }

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento);
        nova.setProxima(primeira);
        primeira = nova;
        if (total == 0) {
            ultima = primeira;
        }
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
        total--;

        if (total == 0) {
            ultima = null;
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
