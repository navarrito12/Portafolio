import org.fusesource.jansi.Ansi;
import org.jetbrains.annotations.NotNull;

public class Casilla {
    private Ficha ficha;

    public Casilla() {}

    public void colocar(@NotNull Ficha ficha) {
        if (!estaVacia())
            throw new IllegalStateException("No es posible colocar la ficha %s en la casilla porque no está vacía"
                    .formatted(ficha));
        this.ficha=ficha;
    }

    public boolean estaVacia() {
        return ficha==null;
    }

    public Ficha getFicha() {
        return ficha;
    }

    @Override
    public String toString() {
        Ansi barra=Ansi.ansi().fgBrightCyan().a("|").reset();
        return "%s%s%s".formatted(barra,
                estaVacia() ? " " :  ficha,
                barra);
    }
}
