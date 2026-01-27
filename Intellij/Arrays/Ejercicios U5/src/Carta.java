import org.jetbrains.annotations.NotNull;

public class Carta {
    private final int numero;         // NO MODIFICABLE
    private final String nombre;      // NO MODIFICABLE
    private final Palo palo;          // NO NULO, NO MODIFICABLE

    public Carta(int numero, @NotNull String nombre, @NotNull Palo palo) {
        this.numero = numero;
        this.nombre = nombre;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "%s de %s".formatted(nombre.isEmpty() ? numero : nombre, palo);
    }
}
