public class Principal
{
    public static void main(String[] args) {        
        Animal a1=new Animal();
        Animal a2=new Animal();
        Animal a3=new Animal();
        a1.comer(5);
        System.out.println("ESTADO DE LOS ANIMALESEstado de los Animales");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        // a1.saludar();    <-- Correcto pero no recomendado
        Animal.saludar();   
        m1();
    }
    
    // Uso de miembros estáticos de la clase utility Math
    private static void m1() {
        System.out.println("\nUSO DE LA CLASE MATH de la clase Math ");
        System.out.println("2^10 = " + Math.pow(2, 10));
        System.out.println("Máximo entre 3 y 5: " + Math.max(3, 5));
        
        double x=Math.min(Math.pow(4,2), Math.PI);
        System.out.println("Mínimo entre (4^2) y PI: " + x);
        
        // No es posible crear instancias de una clase utility
        // Math m1=new Math(); <- Error
    }
}