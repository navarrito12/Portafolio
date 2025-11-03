public class Animal
{
    private String apodo;       // NO NULO, LON>=3
    
    public Animal(String apodo) {
        setApodo(apodo);
    }
    
    public void setApodo(String apodo) {
        assert apodo!=null: "El apodo no puede ser nulo";
        assert apodo.length()>=3:
            "La longitud del apodo debe ser >=3 [apodo=%s longitud=%d]".formatted(apodo, apodo.length());
               String.format("La longitud del apodo debe ser >=3 [apodo=%s longitud=%d]", apodo, apodo.length());
    }
}