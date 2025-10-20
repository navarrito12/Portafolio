public class Util
{
    private Util() {}
    
    public static int sumar(int a, int b) {
        int resultado = a + b;     
        System.out.println("Sumando: " + a + " + " + b + " = " + resultado);
        return resultado;
    }
    
    public static int restar(int a, int b) {
        int resultado = a - b;   
        System.out.println("Restando: " + a + " - " + b + " = " + resultado);
        return resultado;
    }
}