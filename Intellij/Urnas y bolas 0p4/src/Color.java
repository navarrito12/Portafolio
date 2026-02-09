import org.fusesource.jansi.Ansi;

public enum Color
{
    AMARILLO(Ansi.Color.YELLOW),
    AZUL(Ansi.Color.BLUE),
    ROJO(Ansi.Color.RED),
    VERDE(Ansi.Color.GREEN);

    private Ansi.Color colorAnsi;

    Color(Ansi.Color colorAnsi) {
        this.colorAnsi=colorAnsi;
    }

    public Ansi.Color getColorAnsi() {
        return colorAnsi;
    }
}