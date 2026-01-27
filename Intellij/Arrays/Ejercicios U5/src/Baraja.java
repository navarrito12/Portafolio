public class Baraja {
    private static final int NUM_CARTAS = 40;
    private Carta[] mazo;

    public Baraja() {
        mazo = new Carta[NUM_CARTAS];
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        int[] numeros={1,2,3,4,5,6,7,
                10,11,12};
        String[] nombres = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
                "SOTA", "CABALLO", "REY"};
        Palo[] palos = Palo.values();
        for (int i = 0; i < palos.length; i++)
            // Genero las cartas de un palo
            for (int j = 0; j < nombres.length; j++)
                                    mazo[j] = new Carta(numeros[j], nombres[j], palos[i]);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mazo.length; i++)
            if (mazo[i] != null)
                sb.append(mazo[i] + "\n");
        return sb.toString();
    }
}
