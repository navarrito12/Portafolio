public class Principal
{
    public static void main(String[] args) {
        String s="PATATA";        
        System.out.println(m1(s,3));
        StringBuffer sbuf=new StringBuffer(s);
        sbuf.deleteCharAt(3);
        System.out.printf("s=%s\nsbuf=%s\n", s, sbuf);
    }
   
    // String
    // Elimina el caracter que está en la posición pos
    private static String m1(String s, int pos) {
        // TODO: validación no nulidad
        String r="";
        for (int i=0; i<s.length(); i++)
            if (i!=pos)
                r+=s.charAt(i);
        return r;
    }
}