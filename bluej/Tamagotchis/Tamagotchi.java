public class Tamagotchi
{
    private String apodo;   // NO NULO, NO BLANCO, LON [5,10], NO MODIFICABLE
    private int peso;       // >=0 (Kg)
    private int pesoMaximo; // NO MODIFICABLE (Kg)
    
    public Tamagotchi(String apodo, int peso, int pesoMaximo) {
        setApodo(apodo);
        setPeso(peso);
        setPesoMaximo(pesoMaximo);
    }
    
    public String getApodo() {
        return apodo;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public int getPesoMaximo() {
        return pesoMaximo;
    }
    
    private void setApodo(String apodo) {
        assert apodo!=null: "El apodo no puede ser nulo";
        // TODO: resto de restricciones
        this.apodo=apodo;
    }
    
    private void setPeso(int peso) {
        assert peso>=0: "El peso debe ser >=0 [peso=%d]".formatted(peso);
        this.peso=peso;
    }
    
    private void setPesoMaximo(int pesoMaximo) {
        assert pesoMaximo>=0: "El peso máximo debe ser >=0 [pesoMaximo=%d]".formatted(pesoMaximo);
        this.pesoMaximo=pesoMaximo;
    }
    
    // cantidad >=0 (Kg)
    public void comer(int cantidad) {
        assert cantidad>=0: "La cantidad de comida debe ser >=0 [cantidad=%d]".formatted(cantidad);
        assert estaVivo(): "Un tamagotchi no puede comer después estando muerto";
        setPeso(peso+cantidad);
    }
    
    public boolean estaVivo() {
        return peso<=pesoMaximo;
    }
    
    public String toString() {
        return "%s (peso %d Kg / máximo %d Kg, %s)"
            .formatted(apodo, peso, pesoMaximo, estaVivo() ? "VIVO" : "MUERTO");
    }
    
    
    
    
    
    
    
    
    
    
}