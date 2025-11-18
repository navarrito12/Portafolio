public class Principal
{
    public static void main(String[] args) {
        String texto=""; mostrar(texto);
        texto="A"; mostrar(texto);
        texto="CASAS"; mostrar(texto);
        texto="RECONOCER"; mostrar(texto);
    }
    
    private static void mostrar(String s) {
        System.out.printf("¿Es palíndromo %s? %s\n", s, esPalindromo(s) ? "SI" : "NO");
    }
      
    private static boolean esPalindromo2(String s) {
        // TODO: validar no nulidad
        for (int i=0; i<s.length()-i-1; i++)
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        return true;
    }
    
    private static boolean esPalindromo(String s) {
        // TODO: validar no nulidad
        for (int i=0, j=s.length()-1; i<j; i++, j--)
            if (s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
}