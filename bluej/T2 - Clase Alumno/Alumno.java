public class Alumno
{
    // Atributos
    
    // Constantes de clase
    private static final int ANIO_ACTUAL=2025;
    private static final int MIN_ANIO_NAC=1900;
    private static final int MIN_LONGITUD_ALIAS=3;
    private static final String ALIAS_POR_DEFECTO="XXX";
    
    // Variables de instancia
    private String alias;   // NO NULO, NO VACÍO, NO BLANCO, LON>=3
    
    // Nombre completo
    private String nombre;  // NO NULO
    private String ape1;    // NO NULO
    private String ape2;    // NO NULO
    
    private int anioNac;    // >=MIN_ANIO_NAC
    
    // Constructores
    public Alumno() {
        this(ALIAS_POR_DEFECTO, MIN_ANIO_NAC);        
    }
    
    public Alumno(String alias) {
        this(alias, MIN_ANIO_NAC);        
    }
    
    public Alumno(String alias, int anioNac) {
        setAlias(alias);
        setAnioNac(anioNac);
        setNombre("");
        setApe1("");
        setApe2("");
    }
    
    // Accesores
    public String getAlias() {
        return alias;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApe1() {
        return ape1;
    }    
   
    public String getApe2() {
        return ape2;
    }    

    public int getAnioNac() {
        return anioNac;
    }

    
    // Mutadores
    public void setAlias(String alias) {
        assert alias!=null: "El alias no puede ser nulo";
        // assert !alias.isEmpty(): "El alias no puede estar vacío";
        assert !alias.isBlank(): 
            "El alias no puede estar vacío ni ser blanco [alias=%s]"
                .formatted(alias);
        assert alias.length()>=MIN_LONGITUD_ALIAS:
            "El alias no puede tener longitud>=%d [alias=%s, longitud=%d]"
                .formatted(MIN_LONGITUD_ALIAS, alias, alias.length());
        this.alias=alias;
    }
    
    public void setNombre(String nombre) {
        assert nombre!=null: "El nombre no puede ser nulo";
        this.nombre=nombre;
    }
    
    public void setApe1(String ape1) {
        assert ape1!=null: "El primer apellido no puede ser nulo";
        this.ape1=ape1;
    }
    
    public void setApe2(String ape2) {
        assert ape2!=null: "El segundo apellido no puede ser nulo";
        this.ape2=ape2;
    }
    
    public void setAnioNac(int anioNac) {
        assert anioNac>=MIN_ANIO_NAC:
            "El año de nacimiento debe ser >=%d [año de nacimiento=%d]"
                .formatted(MIN_ANIO_NAC, anioNac);
        this.anioNac=anioNac;
    }
    
    // Otros
    
    public int edad() {
        return ANIO_ACTUAL-anioNac;
    }
    
    public String nombreCompleto() {
        return "%s, %s %s".formatted(nombre, ape1, ape2);
    }
    
    // TODO: pendiente de implementar
    public int contarPares(int desde, int hasta) {
        return 0;
    }
    
    public String toString() {
        return "%s [%s] nace en %d (%d años)"
            .formatted(nombreCompleto(), alias, anioNac, edad());
    }
}