public class Principal
{
    public static void main(String[] args) {
        String caracteres="AOPA";
        // String texto="PROGRAMACION";
        // String texto="PATATERO";
        String texto="X";
        System.out.printf("Caracteres=%s Texto=%s Total=%d\n", 
            caracteres, texto, contar(caracteres, texto));
    }
    
    /*
     * NOMBRE: contar
     * DESCRIPCIÓN: cuenta el total de apariciones de caracteres en texto. No pueden haber
     * caracteres repetidos en el parámetro caracteres
     * PARÁMETROS:
     * caracteres   Caracteres a contar en texto
     * texto        Texto donde buscar los caracteres
     * DEVUELVE: el número total de apariciones de los caracteres en texto
     */
    private static int contar(String caracteres, String texto) {
        assert caracteres!=null: "Caracteres no puede ser nulo";
        assert texto!=null: "Texto no puede ser nulo";
        assert !hayRepetidos(caracteres): 
            "No pueden haber caracteres repetidos [caracteres=%s]".formatted(caracteres);
        
        int contador=0;
        for (int i=0; i<texto.length(); i++)
            for (int j=0; j<caracteres.length(); j++)    
                // ¿Es el primer carácter igual al carácter que está en la posición i de texto?
                if (caracteres.charAt(j)==texto.charAt(i))
                    contador++;
                    
        return contador;           
    }
    
    private static boolean hayRepetidos(String s) {
        assert s!=null: "La cadena recibida no puede ser nula";
        for (int i=0; i<=s.length()-2; i++)
            for (int j=i+1; j<=s.length()-1; j++)
                if (s.charAt(i)==s.charAt(j))
                    return true;
        return false;                    
    }
    
    
    
}