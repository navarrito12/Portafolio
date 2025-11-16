import java.util.Random;

public class Principal
{
    public static void main(String[] args) {
       for (int i=1; i<=100; i++)
           // System.out.printf("%d\n", generar(5,12));      
           System.out.printf("%d\n", generar2(5,12));      
    }
   
    // Generación de un número entero aleatorio en el rango [a,b] 
    // Usando el método Math.random()
    private static int generar(int a, int b) {
        assert a<=b: "El extremo inferior debe ser <= que el extremo superior [%d,%d]".formatted(a,b);  
        return (int)(Math.random()*(b-a+1))+a;
    }
    
    // Generación de un número entero aleatorio en el rango [a,b] 
    // Usando el método netxInt(int) de la clase Random
    private static int generar2(int a, int b) {
        assert a<=b: "El extremo inferior debe ser <= que el extremo superior [%d,%d]".formatted(a,b);  
        Random r=new Random();
        return (int)(r.nextInt(b-a+1))+a;
    }
    
    /* 
    private static boolean lanzarMoneda() {
        ???
    }
    */
}