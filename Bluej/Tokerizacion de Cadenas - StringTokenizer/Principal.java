import java.util.StringTokenizer;

public class Principal
{
    public static void main(String[] args) {
        // m1("Me encanta la PROGRAMACIÓN");
        // m2("AZUL->ROJO->VERDE->AMARILLO->VIOLETA->NARANJA", "->");        
        String palabras="A#CASAS#RECONOCER#DABALE ARROZ A LA ZORRA EL ABAD";
        m3(palabras);
    }
    
    // Devuelve: la cadena recibida sin espacios
    private static String eliminarEspacios(String s) {
        // TODO: validación de no nulidad 
        return eliminarCaracter(s, ' ');
    }
    
    // Devuelve: la cadena recibida sin el carácter c
    private static String eliminarCaracter(String s, char c) {
        // TODO: validación de no nulidad                
        String r="";
        for (int i=0; i<s.length(); i++) {
            char actual=s.charAt(i);
            if (actual!=c)
                r+=actual;
        }
        return r;
    }
    
    private static void m3(String s) {
        // TODO: validación de no nulidad        
        StringTokenizer st=new StringTokenizer(s, "#");
        while (st.hasMoreTokens()) {
            String token=eliminarEspacios(st.nextToken());
            System.out.printf("¿Es palíndromo %s? %s\n", 
                token, esPalindromo(token) ? "SI" : "NO");
        }
    }

    private static boolean esPalindromo(String s) {
        // TODO: validar no nulidad
        for (int i=0, j=s.length()-1; i<j; i++, j--)
            if (s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }    
    
    private static void m2(String s, String delim) {
        StringTokenizer st=new StringTokenizer(s, delim);
        
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }    
    
    private static void m1(String s) {
        StringTokenizer st=new StringTokenizer(s);
        
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}