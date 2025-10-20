public class Principal
{
    public static void main(String[] args) {
        Granja g1=new Granja();    
        Granja g2=new Granja();  
        
        Animal liberado;
        
        // Animales
        System.out.println("PESO ANTES DE COMER");
        Animal coquita=new Animal("COQUITA", 5);
        System.out.println(coquita);
        Animal anita=new Animal("ANITA", 4);
        System.out.println(anita);
        Animal koli=new Animal("KOLI", 2);
        System.out.println(koli);
        
        // Comida que han comido kg
        System.out.println("\nCUÁNTO COMEN");
        coquita.comer(3);        
        anita.comer(4);
        koli.comer(5);
        // System.out.println("// --- FIN DE COMIDA ---");
        
        // Agregar a la granja 
        g1.agregar(coquita);
        g1.agregar(anita);
        g2.agregar(koli);
        
        //Sacar y mostrar peso final
        System.out.println("\nPESO DESPUÉS DE COMER");
        
        liberado = g1.sacar();
        System.out.println(liberado);
        
        liberado = g1.sacar();
        System.out.println(liberado);
        
        liberado = g2.sacar();
        System.out.println(liberado);
    }
}