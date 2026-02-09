import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Tablero {
    private static final int FILAS=3;
    private static final int COLUMNAS=3;
    private Casilla[][] casillas;

    public Tablero() {
        casillas=new Casilla[FILAS][COLUMNAS];
        for (int i = 0; i < casillas.length ; i++)
            for (int j = 0; j < casillas[i].length ; j++)
                casillas[i][j]=new Casilla();
    }

    public boolean casillaVacia(@NotNull Coordenada c) {
        if (!esCoordenada(c))
            throw new IllegalArgumentException("Coordenada %s no válida");
        return casillas[c.getFila()][c.getColumna()].estaVacia();
    }

    public void colocar(@NotNull Ficha ficha,@NotNull Coordenada c) {
        if (!esCoordenada(c))
            throw new IllegalArgumentException("Coordenada %s no válida".formatted(c));
        if (!casillaVacia(c))
            throw new IllegalStateException("No es posible colocar la ficha %s en la coordenada %s porque está ocupada"
                    .formatted(ficha, c));
        casillas[c.getFila()][c.getColumna()].colocar(ficha);
    }

    public boolean esCoordenada(@NotNull Coordenada c) {
        return  c.getColumna()>=0 && c.getColumna()<casillas[0].length
                && c.getFila()>=0 && c.getFila()< casillas.length;
    }

    public boolean estaCompleto() {
        for (int i = 0; i < casillas.length; i++)
            for (int j = 0; j < casillas[i].length; j++)
                if (casillas[i][j].estaVacia())
                    return false;
        return true;
    }

    public int getColumnas() {
        return casillas[0].length;
    }

    public int getFilas() {
        return casillas.length;
    }

    // La longitud del array casillas debe ser >=1
    private boolean hayLinea(@NotNull Casilla[] casillas) {
        if (casillas.length<1)
            throw new IllegalArgumentException("La longitud del array casillas debe ser >=1 [longitud=%d]"
                    .formatted(casillas.length));
        if (casillas[0].estaVacia())
            return false;
        Ficha primera=casillas[0].getFicha();
        for (int i = 1; i < casillas.length; i++)
            if (casillas[i].estaVacia() || !casillas[i].getFicha().equals(primera))
                return false;
        return true;
    }

    public boolean hayTresEnRaya() {
        return horizontales() || verticales() || diagonales();
    }

    // TODO (09/02/2026-ebarrab): cambiar a private
    public boolean horizontales() {
        for (int i = 0; i < casillas.length; i++)
            if (hayLinea(casillas[i]))
                return true;
        return false;
    }

    private boolean verticales() {
        throw new UnsupportedOperationException("No implementado aún");
    }

    private boolean diagonales() {
        throw new UnsupportedOperationException("No implementado aún");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < casillas.length ; i++) {
            for (int j = 0; j < casillas[i].length; j++)
                sb.append(casillas[i][j]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
