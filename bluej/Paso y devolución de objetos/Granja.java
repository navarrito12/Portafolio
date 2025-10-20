public class Granja
{
    private Animal [] animales; 
    
    private int numAnimales;
    
    public Granja() {
        this.animales = new Animal[10];
        this.numAnimales = 0;
    }
    
    public void agregar(Animal animal) {
        assert animal!=null: "El animal a agregar no puede ser nulo";
        assert numAnimales < animales.length: "No es posible agregar, la granja está llena";
        this.animales[numAnimales]=animal;
        numAnimales++;
    }
    
    public Animal sacar() {
        assert !estaVacia(): "No es posible sacar un animal de la granja porque está vacía";        
        numAnimales--; 
        Animal aux = animales[numAnimales];
        animales[numAnimales] = null; 
        return aux;
    }
    
    public boolean estaVacia() {
        return numAnimales==0;
    }
}