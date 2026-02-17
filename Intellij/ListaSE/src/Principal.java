public class Principal {
    public static void main(String[] args) {
        ListaSE lista=new ListaSE();
        for (int i = 0; i <= 9; i++)
            lista.agregar(new Nodo(i));
        System.out.println(lista.longitud());

        try {
            System.out.println(lista.get(0));
            System.out.println(lista.get(10));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // TODO (12/02/2026 - ebarrab): Revisar borrar
        lista.borrar();
    }
}
