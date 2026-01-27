import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
//        e5p4();
//        e5p5
//        System.out.println(nombreDia(8));
//        System.out.println(nombreDia(2));
//        int[] pares={2,4,6,8,10};
//        rotarDerecha(pares);
//        System.out.println(pares);
//        System.out.println(Arrays.toString(generarPares()));
//        System.out.println(Arrays.toString(frecuencias(10)));
        ejercicioBaraja();
    }

    private static void e5p3() {
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        int numeroElementos=diasMes.length;
        diasMes[1]=29;
    }

    private static void e5p4() {
        int[] a={1,2,3,5,7};
        for (int e: a)
            System.out.print(e);
    }

    // e5p5
    private static String nombreDia(int numDiaSemana) {
        String[] nombres={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return numDiaSemana>=0 && numDiaSemana<nombres.length ? nombres[numDiaSemana] : "Día incorrecto";
    }

    // e5p7
    private static int maximo(int[] a) {
        assert a!=null || a.length==0: "El array no puede ser nulo ni de longitud 0";

        int maximo=a[0];
        for (int i = 1; i < a.length ; i++)
            if (a[i]>maximo)
                maximo=a[i];
        return maximo;
    }

    // e5p8
    private static int[] pares(int[] a) {
        assert a!=null: "El array no puede ser nulo";
        if (a.length==0)
            return new int[0];
        // Contar el número de pares
        int contador=0;
        for (int i = 0; i < a.length ; i++)
            if (i%2==0)
                contador++;
        // Crear array resultado y rellenar con números pares del array a
        int[] r=new int[contador];
        for (int i = 0, j = 0; i < a.length; i++)
            if (i%2==0)
                r[j++]=a[i];
        return r;
    }

    // e5p9
    public static void rotarDerecha(int[] numeros) {
        assert numeros!=null: "El array no puede ser nulo";
        if (numeros.length<=1)
            return;
        int aux=numeros[numeros.length-1];
        for (int i = numeros.length-1; i >= 1; i--)
            numeros[i]=numeros[i-1];
        numeros[0]=aux;
    }

    // 5p10
    public static int[] generarPares() {
        final int MAX=10, MIN_ALEATORIO=1, MAX_ALEATORIO=50;
        int[] pares=new int[MAX];
        int aleatorio=0;
        for (int i = 0; i < pares.length; i++) {
            do
                aleatorio=(int)(Math.random()*MAX_ALEATORIO)+MIN_ALEATORIO;
            while (!(aleatorio%2==0));
            pares[i]=aleatorio;
        }
        return pares;
    }

    // 5p11
    public static int[] frecuencias(int n) {
        assert n>=0: "n debe ser >=0";
        final int MAX=100;              // Nº de números aleatorios a generar
        int[] f=new int[n+1];           // Frecuencias
        int aleatorio;
        for (int i = 0; i < MAX ; i++) {
            aleatorio = (int) (Math.random() * (n + 1));   // [0,n]
            f[aleatorio]++;
        }
        return f;
    }

    // 5p12
    public static void ejercicioBaraja() {
        Baraja b1=new Baraja();
        System.out.println(b1);
    }
}
