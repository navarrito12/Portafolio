public class Principal
{
    public static void main(String[] args) {
        Animal a1=new Animal("DYANGO", 15);
        Animal a2=new Animal("LOLA", 10);
        Animal a3=new Animal("NEGRITO", 5);
        Animal a4=new Animal("COQUITA", 20);
        
        System.out.printf("%s\n%s\n%s\n%s\n", a1, a2, a3, a4);
        
        // Alimentamos a los animales
        a1.comer();
        a2.comer();
        a3.comer(10);
        a4.comer(20);
        
        System.out.println("\nAnimales tras comer");
        System.out.printf("%s\n%s\n%s\n%s\n", a1, a2, a3, a4);
    }
}