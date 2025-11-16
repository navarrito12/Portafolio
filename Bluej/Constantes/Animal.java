public class Animal
{
    private static final int MIN_PESO=10;       // gramos
    private static final int MAX_PESO=1000;     // Valor de ejemplo para el peso máximo
    
    // private final int maxPeso;                  // >=MIN_PESO               <-ACTIVIDAD
    
    // Atributos de Instancia
    private String nombre;                      // NO NULO
    private int peso;                           // [MIN_PESO, maxPeso}<-- Nota: El rango es ahora inclusivo si usas <=
    // ... (El constructor ahora compila) ...<-ACTIVIDAD
    
    public Animal(String nombre, int peso) {
        setNombre(nombre);
        setPeso(peso);
    }
    
    public void setNombre(String nombre) {
        assert nombre!=null: "El nombre no puede ser nulo";
        this.nombre=nombre;
    }
    
    public void setPeso(int peso) {
        assert (peso >= MIN_PESO && peso <= MAX_PESO) : 
        // ¡OJO! Se añadió un punto y coma aquí V
        String.format("El peso debe estar entre %d y %d [peso=%d]", 
            MIN_PESO, MAX_PESO, peso);   
        this.peso = peso;
    }

    public String toString() {
         return String.format("%s (%d gramos)", nombre, peso);
                // return "%s (%d gramos)".formatted(nombre, peso);
    }
    
     public int contarPares(int inicio, int fin) {
        // Para que dé un número diferente de 0, puedes implementar el conteo real:
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador; // Devuelve la cantidad de números pares (ej: 5 para 1 a 10)
    }
}