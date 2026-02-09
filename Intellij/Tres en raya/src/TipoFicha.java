import org.fusesource.jansi.Ansi;

public enum TipoFicha {
    O(Ansi.Color.GREEN),X(Ansi.Color.MAGENTA);

    private Ansi.Color color;

    TipoFicha(Ansi.Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return Ansi.ansi().fg(color).a(this.name()).reset().toString();
    }
}
