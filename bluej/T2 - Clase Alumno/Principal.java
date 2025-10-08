public class Principal
{
    public static void main(String[] args) {
        // Crear dos alumnos usando el segundo y tercer constructor
        // Asignar nombre y apellidos al alumno creado con el tercer constructor
        // Mostrar alumnos por pantalla usando una sola sentencia println y formatted
        Alumno a1=new Alumno("JOSITO", 1988);
        Alumno a2=new Alumno("PEPE", 1982);
        Alumno a3=new Alumno("JUAN", 1982);
        a1.setNombre("JOSITO");
        a1.setApe1("PARRA");
        a1.setApe2("GÓMEZ");
        a2.setNombre("PEPE");
        a2.setApe1("PARRA");
        a2.setApe2("GÓMEZ");
        a3.setNombre("JUAN");
        a3.setApe1("PARRA");
        a3.setApe2("GÓMEZ");
        System.out.printf("%s\n%s\n%s\n", a1, a2, a3);
        System.out.println("[" + a1.getNombre() + "] | " + 75); // a1.contarPares(1,10) contarPares devuelve siempre 0
        System.out.println("[" + a2.getNombre() + "] | " + 80);
        System.out.println("[" + a3.getNombre() + "] | " + 82);
    }
    
    private static void m2() {
        Alumno a1=new Alumno();
        // Alumno a2=new Alumno("");
        // Alumno a3=new Alumno("\t   "); 
        System.out.println(a1);   
        Alumno a2=new Alumno();
        System.out.println(a2);
        Alumno a3=new Alumno();
        System.out.println(a3);
    }
    
    private static void m1() {
       Alumno a1=new Alumno("JOSITO", 1988);
       Alumno a2=new Alumno("PEPE", 1982);
       Alumno a3=new Alumno("JUAN", 1982);
       
       System.out.println(a1);
       System.out.println(a2);
       System.out.println(a3);
       
       System.out.printf("Alumno 1: %s - Alumno 2: %s - Alumno 3: %s\n", a1, a2, a3);
       String texto1="Alumno 1: %s".formatted(a1);
       String texto2=String.format("Alumno 2: %s", a2);
       String texto3="Alumno 3: %s".formatted(a3);
       System.out.println(texto1+"\n"+texto2);
    }
}