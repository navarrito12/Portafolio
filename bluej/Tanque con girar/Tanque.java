public class Tanque {
    private static final int MIN_FILA = 0;
    private static final int MAX_FILA = 5;
    private static final int MIN_COLUMNA = 0;
    private static final int MAX_COLUMNA = 9;
    private static final String DIRECCIONES = "NESO";
    private static final char DIRECCION = 'N';

    private int fila;
    private int columna;
    private char direccion;

    public Tanque() {
        this(DIRECCION);
    }

    public Tanque(int fila, int columna) {
        validarRango(fila, MIN_FILA, MAX_FILA, "fila");
        validarRango(columna, MIN_COLUMNA, MAX_COLUMNA, "columna");
        this.fila = fila;
        this.columna = columna;
        setDireccion(DIRECCION);
    }

    public Tanque(char direccion) {
        this.fila = Util.generarAleatorio(MIN_FILA, MAX_FILA);
        this.columna = Util.generarAleatorio(MIN_COLUMNA, MAX_COLUMNA);
        setDireccion(direccion);
    }

    private void validarRango(int valor, int min, int max, String campo) {
        if (valor < min || valor > max) {
            throw new IllegalArgumentException("El valor de " + campo + " (" + valor + ") está fuera del rango [" + min + "," + max + "]");
        }
    }

    public void setDireccion(char direccion) {
        if (DIRECCIONES.indexOf(direccion) < 0) {
            throw new IllegalArgumentException("Dirección inválida: " + direccion + " [válidas=" + DIRECCIONES + "]");
        }
        this.direccion = direccion;
    }

    public void avanzar(int distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("La distancia debe ser >= 0 [distancia=" + distancia + "]");
        }

        int nuevaFila = fila;
        int nuevaColumna = columna;

        switch (direccion) {
            case 'N': nuevaFila -= distancia; break;
            case 'E': nuevaColumna += distancia; break;
            case 'S': nuevaFila += distancia; break;
            case 'O': nuevaColumna -= distancia; break;
            default:
                throw new IllegalStateException("Dirección inesperada: " + direccion);
        }

        validarRango(nuevaFila, MIN_FILA, MAX_FILA, "fila");
        validarRango(nuevaColumna, MIN_COLUMNA, MAX_COLUMNA, "columna");

        fila = nuevaFila;
        columna = nuevaColumna;
    }

    public void girar() {
        int i = DIRECCIONES.indexOf(direccion);
        setDireccion(DIRECCIONES.charAt((i + 1) % DIRECCIONES.length()));
    }

    public void girar(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("El número de giros debe ser >= 1 [n=" + n + "]");
        }
        for (int i = 0; i < n; i++) {
            girar();
        }
    }

    public String toString() {
        return "(%d,%d) %c".formatted(fila, columna, direccion);
    }
}
