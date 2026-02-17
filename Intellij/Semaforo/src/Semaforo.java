import org.jetbrains.annotations.NotNull;

public class Semaforo {
    public static final int T1=3;      // Tiempo de ROJO a VERDE
    public static final int T2=2;      // Tiempo de VERDE a AMARILLO
    public static final int T3=1;      // Tiempo de AMARILLO a ROJO

    private Color color;    // NO NULO

    public Semaforo() {
        setColor(Color.ROJO);
    }

    // Cambio automático por tiempos (T1, T2, T3)
    public void cambiar() {
        switch (color) {
            case ROJO:
                setColor(Color.VERDE);
                break;
            case VERDE:
                setColor(Color.AMARILLO);
                break;
            case AMARILLO:
                setColor(Color.ROJO);
                break;
            default:
                System.err.printf("Color desconocido en el semáforo [color=%s]", color);
                System.exit(1);
        }
    }

    public Color getColor() {
        return color;
    }

    // Cambio de color cuando se pulsa el botón
    public void pulsarBoton() {
        switch (color) {
            case ROJO:
                setColor(Color.VERDE);
                break;
            case VERDE:
                break;
            case AMARILLO:
                throw new IllegalStateException("El semáforo está en AMARILLO y no se esperaba que se pulsara el botón");
            default:
                System.err.printf("Color desconocido en el semáforo [color=%s]",  color);
                System.exit(1);
        }
    }

    public void setColor(@NotNull Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color.toString();
    }
}
