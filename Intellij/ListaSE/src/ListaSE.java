import org.jetbrains.annotations.NotNull;

public class ListaSE {
    private Nodo inicio;

    public ListaSE() {}

    public void agregar(@NotNull Nodo nodo) {
        if (estaVacia()) {
            inicio = nodo;
            return;
        }
        Nodo aux=inicio;
        while (aux.getSgte()!=null)
            aux=aux.getSgte();
        aux.setSgte(nodo);
    }

    public void agregar(int e) {
        agregar(new Nodo(e));
    }

    public void borrar() {
        inicio=null;
    }

    public boolean estaVacia() {
        return inicio==null;
    }

    public Nodo get(int posicion) {
        if (posicion<0)
            throw new IllegalArgumentException("La posición no puede ser negativa [posicion=%d]"
                    .formatted(posicion));
        if (estaVacia())
            throw new IllegalStateException("No es posible obtener un nodo porque la lista está vacía");
        Nodo aux=inicio;
        int contador=0;
        while (aux.getSgte()!=null && contador<posicion) {
            contador++;
            aux = aux.getSgte();
        }
        if (contador<posicion)
            throw new IllegalArgumentException("Posición inexistente [posición=%d]".formatted(posicion));
        return aux;
    }

    public int longitud() {
        Nodo aux=inicio;
        int contador=0;
        while (aux!=null) {
            contador++;
            aux = aux.getSgte();
        }
        return contador;
    }
}
