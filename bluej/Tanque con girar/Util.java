public class Util {
    private Util() {}

    public static boolean en(int x, int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("El extremo inferior del rango debe ser <= que el superior [" + a + "," + b + "]");
        }
        return x >= a && x <= b;
    }

    public static int generarAleatorio(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("Rango inválido: a > b [" + a + "," + b + "]");
        }
        return (int)(Math.random() * (b - a + 1)) + a;
    }
}
