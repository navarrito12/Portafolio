public class Principal
{
    public static void main(String[] args) {
        String s1="HOLA";
        String s2="HOLA";
        String s3=new String("HOLA");
        String s4=new String("MOLA");
        
        // Mostramos cadenas
        System.out.printf("s1=%s\n", s1);
        System.out.printf("s2=%s\n", s2);
        System.out.printf("s3 new=%s\n", s3);
        System.out.printf("s4 new=%s\n", s4);
        
        // Comparación usando == (referencias)
        System.out.println("Comparación usando ==");
        System.out.printf("¿s1==s2? %b\n", s1==s2);
        System.out.printf("¿s2==s3? %b\n", s2==s3);
        System.out.printf("¿s3==s4? %b\n", s3==s4);
        
        // Comparación usando equals
        System.out.println("Comparación usando equals");
        System.out.printf("¿s1.equals(s2)? %b\n", s1.equals(s2));
        System.out.printf("¿s2.equals(s3)? %b\n", s2.equals(s3)); 
        System.out.printf("¿s3.equals(s4)? %b\n", s3.equals(s4));
        
        // Intentamos modificar el objeto s2
        System.out.println("Uso de replace");
        s2=s2.replace('H','C');
        s4=s2.replace('O','A');
        System.out.printf("s1=%s\n", s1);
        System.out.printf("s2=%s\n", s2);
        System.out.printf("s4=%s\n", s4);
        System.out.printf("s4.replace('A','U')=%s\n", s4.replace('A','U'));
    }
}