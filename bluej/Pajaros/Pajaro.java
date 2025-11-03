public class Pajaro
{
    private static final int MIN_LONGITUD=3;    // Longitud mínima del apodo
    private static final int MIN_PESO=10;       // gramos
    private String apodo;                       // NO NULO, NO VACÍO, NO BLANCO, LON>=MIN_LONGITUD
    private int peso;                           // peso [MIN_PESO, maxPeso] (gramos)
    private final int maxPeso;                  // >=0, NO MODIFICABLE (gramos)
    private boolean vivo;                       // true
    
    public Pajaro(String apodo, int peso, int maxPeso) {
        vivo=true;
        setApodo(apodo);        
        this.maxPeso=validarMaxPeso(maxPeso);
        setPeso(peso);        
    }
    
    private boolean validarPesos(int peso, int maxPeso) {
        return peso>=MIN_PESO && peso<=maxPeso;
    }
    
    public void setApodo(String apodo) {
        assert apodo!=null: "El apodo no puede ser nulo";
        assert !apodo.isBlank(): "El apodo no puede estar vacío ni blanco [apodo=%s]"
            .formatted(apodo);
        assert apodo.length()>=MIN_LONGITUD:
            "La longitud del apodo debe ser >=%d [apodo=%s longitud=%d]"
            .formatted(MIN_LONGITUD, apodo, apodo.length());
        this.apodo=apodo;
    }
   
    private void setPeso(int peso) {
        this.peso=peso;
        if (peso>maxPeso)
            morir();
    }
    
    private int validarMaxPeso(int maxPeso) {
        assert maxPeso>=0: "El peso máximo debe ser >=0 [pesoMaximo=%d]".formatted(maxPeso);          
        return maxPeso;
    }
    
    // cantidad >=0 (gramos)
    public void comer(int cantidad) {
        assert cantidad>=0: "La cantidad de comida debe ser >=0 [cantidad=%d]".formatted(cantidad);
        assert estaVivo(): "No es posible dar de comer a un pájaro muerto";
        engordar(cantidad);
    }
    
    // cantidad >=0 (gramos)
    private void engordar(int cantidad) {
        assert cantidad>=0: "La cantidad de comida debe ser >=0 [cantidad=%d]".formatted(cantidad);
        setPeso(peso+cantidad);            
    }
    
    public void envenenar() {
        if (estaVivo())
            morir();
    }
    
    public boolean estaVivo() {
        return vivo;
    }
    
    private void morir() {
        vivo=false;
    }
  
}