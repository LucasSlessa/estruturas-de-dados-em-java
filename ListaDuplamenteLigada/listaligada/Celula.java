package listaligada;

class Celula {
    private Object elemento;
    private Celula proxima;
    private Celula anterior;

    public Celula(Object elemento) {
        this.elemento = elemento;
        this.proxima = null;
        this.anterior = null;
    }

    public Celula(Object elemento, Celula anterior, Celula proxima) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

}