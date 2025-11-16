public class Animal
{
    private static int contador=0;  // Número total de animales
    private int numero;             // AUTOINCREMENTADO
    private int peso;
    
    public Animal() {
        numero=++contador;
        peso=0;
    }
    
    public void irDeFiesta() {
        // beber();
        comer(3);
    }
    
    public void comer(int cantidad) {
        peso += cantidad;
    }
    
    public static void saludar() {
        // System.out.println("Soy el animal %d", numero); <- Error
        System.out.printf("Soy un animal de los %d que existen\n", contador);
        e();
        // comer(5); <- Error        
    }
    
    public static void e() {
        System.out.println("Soy el método estático e\n");
    }
    
    public String toString() {
        return "Animal %d [Peso=%d, Total_Existentes=%d]".formatted(numero, peso, contador);
    }
}