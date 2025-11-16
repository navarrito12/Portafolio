public class Principal
{
    public static void main(String[] args) {
        String s1="HOLA";
        String s2="HOLA";
        String s3="COLA";
        String s4="SOLA";
        String s5="SOL";
        String s6="SOLAMENTE";
        String s7="SALA";
        
        System.out.printf("s1=%s\n", s1);
        System.out.printf("s2=%s\n", s2);
        System.out.printf("s3=%s\n", s3);
        System.out.printf("s4=%s\n", s4);
        
        // charAt
        System.out.printf("s1.charAt(0)=%c\n", s1.charAt(0));
        // System.out.printf("s1.charAt(4)=%c", s1.charAt(4));  <- Error
        
        // compareTo
        System.out.printf("s1.compareTo(s2)=%d\n", s1.compareTo(s2));
        System.out.printf("s2.compareTo(s3)=%d\n", s2.compareTo(s3));
        System.out.printf("s2.compareTo(s4)=%d\n", s2.compareTo(s4));
        System.out.printf("s4.compareTo(s5)=%d\n", s4.compareTo(s5));
        System.out.printf("s4.compareTo(s6)=%d\n", s4.compareTo(s6));
        System.out.printf("s4.compareTo(s7)=%d\n", s4.compareTo(s7));
        
        // Códigos UNICODE
        System.out.printf("Código UNICODE de %c=%d\n", 'A', (int)'A');
        System.out.printf("Código UNICODE de %c=%d\n", 'O', (int)'O');
        System.out.printf("'O'-'A'=%d\n", 'O'-'A');
        
        // contains
        System.out.printf("\"PROGRAMACION\".contains(\"GRAMA\")=%b\n", 
            "PROGRAMACION".contains("GRAMA"));
        
        // equals (ya visto en el proyecto: Comparación de cadenas
        
        // format
        System.out.println("String.format vs formatted");
        String saludo=String.format("Apodo=%s [%d Kg]", "COQUITA", 2);
        System.out.println(saludo);        
        System.out.println("Apodo=%s [%d Kg]".formatted("COQUITA", 2));
        
        //hasCode
        System.out.printf("HOLA hashCode=%X\n", "HOLA".hashCode());
        System.out.printf("HOLA hashCode=%X\n", "HOLA".hashCode());
        System.out.printf("new HOLA hashCode=%X\n", new String("HOLA").hashCode());
        System.out.printf("new HOLA hashCode=%X\n", new String("HOLA").hashCode());
        System.out.printf("COLA hashCode=%X\n", "COLA".hashCode());
        
        // indexOf
        char c='A';
        String texto="PROGRAMACION";
        System.out.printf("Posición del caracter %c en %s=%d\n", 
            c, texto, texto.indexOf('A'));
        System.out.printf("Posición del caracter %c en %s=%d\n", 
            'X', texto, texto.indexOf('X'));
        System.out.printf("¿Está el carácter 'B' en %s? %s\n",
            texto, texto.indexOf('B')>=0 ? "SI" : "NO");
            
        // isBlank
        System.out.printf("\"\".isBkank()=%b\n","".isBlank());
        String blanco=" ".repeat(5);
        System.out.printf("\"%s\".isBkank()=%b\n", blanco, blanco.isBlank());
        blanco="\n\t \r\u000B";
        System.out.printf("\"%s\".isBkank()=%b\n", blanco, blanco.isBlank());
        
        // isEmpty
        String apodo="";
        System.out.printf("\"%s\".isEmpty()=%b\n", apodo, apodo.isEmpty());
        apodo=" ";
        System.out.printf("\"%s\".isEmpty()=%b\n", apodo, apodo.isEmpty());
        
        //length
        apodo="";
        System.out.printf("\"%s\".isEmpty()=%d\n", apodo, apodo.length());
        apodo="ANITA";
        System.out.printf("\"%s\".isEmpty()=%d\n", apodo, apodo.length());
        
        // repeat
        String titulo="PROGRAMACION DE SERVICIOS Y PROCESOS";
        String subrayado="-".repeat(titulo.length());
        System.out.printf("%s\n%s\n", titulo, subrayado);
        
        // replace
        String ape1="BARRA";
        System.out.printf("\"%s\".replace('A','O')=%s\n", ape1, ape1.replace('A','O'));
        System.out.printf("ape1=%s\n", ape1);
        
        // substring
        //                    11
        //          012345678901

        String sub1="PROGRAMACION".substring(3);
        String sub2="PROGRAMACION".substring(3,8);
        System.out.println("PROGRAMACION");
        System.out.println(sub1);
        System.out.println(sub2);
        
        // toLowerCase
        String nombreCompleto="Andrea Navarro Ojopi";
        System.out.println(nombreCompleto);
        System.out.println(nombreCompleto.toLowerCase());
        
        //toUpperCase
        System.out.println(nombreCompleto.toUpperCase());
        
        // toString
        System.out.println(nombreCompleto);
        System.out.println(nombreCompleto.toString());       // <- No necesario
        
        //trim
        String t1="     \tENTORNOS DE DESARROLLO    \n";
        System.out.printf("t1=\"%s\"\n", t1);
        System.out.printf("Longitud de t1 (antes del trim)=%d\n", t1.length());
        String t2=t1.trim();
        System.out.printf("t1=\"%s\" (después del trim)\n", t1);
        System.out.printf("Longitud de t1 (después del trim)=%d\n", t1.length());
        System.out.printf("t2=\"%s\" (después del trim)\n", t2);
        System.out.printf("Longitud de t2=t1.trim()=%d\n", t2.length());
        
        // valueOf
        String n1=String.valueOf(1);
    }
}