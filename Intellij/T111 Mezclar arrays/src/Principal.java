import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        String[] cadenas1={"", "", "a", "a", "abc", "12345", "abc"};
        String[] cadenas2={"", "a", "", "b", "12345", "abc", "123"};

        // TODO (02/02/2026 - ebarrab): Pendiente pruebas con null

        // Probamos el método mezclar con distintas array
        // TODO (02/02/2026 - ebarrab): REVISAR
        for (int i = 0; i < cadenas1.length; i++) {
            char[] a1 = cadenas1[i].toCharArray();
            char[] a2 = cadenas2[i].toCharArray();
            System.out.printf("a1=%s\n", Arrays.toString(a1));
            System.out.printf("a2=%s\n", Arrays.toString(a2));
            System.out.printf("Mezcla: %s\n", Arrays.toString(mezclar(a1, a2)));
            System.out.println("-".repeat(30));
        }
    }

    private static char[] mezclar(char[] a1, char[] a2) {
        // TODO (02/02/2026 - ebarrab): validación de parámetros
        char[] corta=a1.length <= a2.length ? a1 : a2;
        char[] larga=(corta==a1) ? a2 : a1;
        char[] r=new char[corta.length+ larga.length];
        int i=0;
        for (; i<corta.length ; i++) {
            r[i*2]=corta[i];
            r[i*2+1]=larga[i];
        }
        // Resto de la larga
        for (int j=i*2; j<r.length-1; j++, i++)
            r[j]=larga[i];

        return r;
    }
}
