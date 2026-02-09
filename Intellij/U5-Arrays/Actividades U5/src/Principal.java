public class Principal {
    public static void main(String[] args) {
        String titulo="Actividades U5";
        System.out.println(titulo);
        System.out.println("-".repeat(titulo.length()));
//        a5p2();
        int[] numeros=new int[]{2,4,6,8,10,12};
        invertir(numeros);
        mostrar(numeros);
        int[] array0=new int[0];        // Error
        mostrar(array0);
//        mostrar(new int[]{});
    }

    private static void a5p2() {
        int[] numeros=new int[5];

        // Intento de inicialización
        System.out.println("for each");
        for (int e: numeros) {
            e = 2;
            System.out.printf("e=%d\n", e);
        }

        // Mostrar el array numeros (for)
        System.out.println("Mostrar el array numeros (for)");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }

        System.out.println();

        // Mostrar el array numeros (for each)
        System.out.println("Mostrar el array numeros (for each)");
        for (int e: numeros)
            System.out.print(e);
    }

    private static void invertir(int[] valores) {
        if (valores==null)
            return;

        int aux;
        for (int i = 0, j = valores.length-1; i < j ; i++, j--) {
            // Intercambiar los elementos i y j
            intercambiar(valores, i, j);
//            aux=valores[i];
//            valores[i]=valores[j];
//            valores[j]=aux;
        }
    }

    // a5p3
    private static void mostrar(int[] a) {
        if (a==null)
            return;
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(","+a[i]);
        }
    }

    // a5p7
    private static void intercambiar(int[] a, int i, int j) {
        assert a!=null: "El array no puede ser nulo";
        if (a.length==0)
            return;
        assert i>=0 && i<a.length && j>=0 && j<a.length:
                "Las posiciones i=%d y j=%d deben estar en el rango [0,%d]"
                        .formatted(i, j, a.length-1);
        if (i==j)
            return;
        int aux=a[i];
        a[i]=a[j];
        a[j]=aux;
    }




}