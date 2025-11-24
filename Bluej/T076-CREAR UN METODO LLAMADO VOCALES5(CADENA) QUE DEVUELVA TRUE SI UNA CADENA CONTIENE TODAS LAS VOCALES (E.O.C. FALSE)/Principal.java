public class Principal
{
    public static void main(String[] args) {
        // String palabra="MURCIELAGO";
        String palabra="AQUI";
        System.out.printf("¿Contiene las 5 vocales la palabra %s? %s\n", 
            palabra, vocales5(palabra) ? "SI" : "NO");
    }
    
    // Sin usar indexOf
    private static boolean vocales5b(String cadena) {
        // TODO: validación de no nulidad
        cadena=cadena.toUpperCase();
        String vocales="AEIOU";
        for (int i=0; i<vocales.length(); i++) {
            boolean hayVocal=false;
            // Si la vocal no está en la cadena
            for (int j=0; j<cadena.length(); j++)
                if (vocales.charAt(i)==cadena.charAt(j)) {
                    hayVocal=true;
                    break;
                }
            if (!hayVocal)
                return false;
        }
        return true;
    }    
    
    
    private static boolean vocales5(String cadena) {
        // TODO: validación de no nulidad
        cadena=cadena.toUpperCase();
        String vocales="AEIOU";
        int contador=0;
        for (int i=0; i<vocales.length(); i++)
            // Si la vocal no está en la cadena
            if (cadena.indexOf(vocales.charAt(i))==-1)
                return false;
        return true;
    }
}