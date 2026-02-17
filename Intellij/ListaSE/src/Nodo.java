public class Nodo {
    private int e;
    private Nodo sgte;

    public Nodo(int e) {
        this.e = e;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    @Override
    public String toString() {
        return "[%d]".formatted(e);
    }
}
