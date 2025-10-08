public class Animal
{
    private String apodo;   // NO NULO, NO VACÍO
    private int peso;       // >=0, gramos
    
    public Animal(String apodo) {
        setApodo(apodo);
    }
    
    public String getApodo() {
        return apodo;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setApodo(String apodo) {
        assert apodo!=null: "El apodo no puede ser nulo";
        assert !apodo.isEmpty(): "El apodo no puede estar vacío";
        this.apodo=apodo;
    }
    
    public void setPeso(int peso) {
        // assert peso>=0: String.format("El peso debe ser >=0 [peso=%d]", peso);
        assert peso>=0: "El peso debe ser >=0 [peso=%d]".formatted(peso);
        this.peso=peso;
    }
    
    public String toString() {
        return "%s (%d gramos)".formatted(apodo, peso);
    }
}