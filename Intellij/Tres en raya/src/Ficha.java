import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Ficha {
    private TipoFicha tipo;       // NO NULO

    public Ficha(@NotNull TipoFicha tipo) {
        this.tipo=tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ficha ficha = (Ficha) o;
        return tipo == ficha.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }

    @Override
    public String toString() {
        return tipo.toString();
    }
}
