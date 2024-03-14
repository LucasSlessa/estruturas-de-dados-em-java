package listaligada;

class Celula {
    private Object elemento;
    private Celula proxima;

    public Celula(Object elemento) {
        this.elemento = elemento;
        this.proxima = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}