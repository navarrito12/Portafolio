import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        LinkedList<Bola> bolas=new LinkedList<>();
        Color[] colores=Color.values();
        for (int i = 0; i <= 7; i++)
            bolas.add(new Bola(colores[i%colores.length]));
        for (Bola bola: bolas)
            System.out.printf("%s ", bola);
    }

    // ArrayList
    private static void m1() {
        ArrayList<Integer> pares=new ArrayList<>();
        for (int i = 0; i <= 16; i++)
            pares.add(i*2);
        for (int i = 0; i < pares.size(); i++)
            System.out.printf("%d ", pares.get(i));
        System.out.println();
        System.out.println(pares.indexOf(4));
        System.out.println(pares.indexOf(3));
        pares.set(4, 99);
        System.out.println(pares);
    }
}
