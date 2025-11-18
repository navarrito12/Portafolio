public class Principal
{
    public static void main(String[] args) {
        System.out.println(hayRepetidos("HOLA"));
        System.out.println(hayRepetidos("PATATA"));
    }   

    private static int contar(String caracteres, String texto) {
        // TODO: validación de parámetros
        return 1;
    }
    
    private static boolean hayRepetidos(String s) {
        // TODO: validación de parámetros
        for (int i=0; i<=s.length()-2; i++)
            for (int j=i+1; j<=s.length()-1; j++)
                if (s.charAt(i)==s.charAt(j))
                    return true;
        return false;            
    }
    
}