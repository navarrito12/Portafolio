import org.fusesource.jansi.Ansi;

import static util.Util.linea;

public class Principal
{
   public static void main(String[] args) {
       m4();
   }

   // v0p4
    private static void m4() {
        int[] capacidades={3,5,7};
        Urna[] urnas=new Urna[capacidades.length];
        for (int i = 0; i < urnas.length; i++)
            urnas[i] = new Urna(capacidades[i]);
        mostrarUrnas(urnas);
//        Color[] colores=Color.values();
//        for (int i = 1; i <= 3; i++)
//            urnas[0].agregar(new Bola(colores[(i-1)%3]));
//        mostrarUrnas(urnas);

        System.out.println("Urna 1");
        // Llenamos la urna 1
        urnas[1].llenar();
        System.out.println(urnas[1]);
        // Sacamos 3 bolas aleatoriamente de la urna 1
        for (int i = 1; i <= 3 ; i++) {
            urnas[1].sacar();
            System.out.println(urnas[1]);
        }

    }

    private static void mostrarUrnas(Urna[] urnas) {
        for (int i = 0; i < urnas.length; i++)
            System.out.println(urnas[i]);
    }
}