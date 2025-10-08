public class Alumno {
    private static final int ANIO_ACTUAL=2025;
    
    // Atributos
    private String alias;
    
    // Nombre completo
    private String nombre;
    private String ape1;
    private String ape2;
    
    private int anioNac;    // Año de nacimiento
    
    // Constructores
    public Alumno() {
        alias="";
        nombre="";
        ape1="";
        ape2="";
        anioNac=0;
    }
    
    public Alumno(String alias) {
        this.alias=alias;
    }
    
    public Alumno(String alias, int anioNac) {
        this.alias=alias;
        this.anioNac=anioNac;
    }
    
    public int edad() {
        return ANIO_ACTUAL-anioNac;
    }
    
    public String nombreCompleto() {
        return nombre+", "+ape1+" "+ape2;
    }
    
    public String toString() {
        return alias+"|"+nombreCompleto()+" (nace en "+anioNac+", "+edad()+" años)";
    }
    
    public Alumno(String alias, String nombre, String ape1, String ape2, int anioNac) {
    this.alias = alias;
    this.nombre = nombre;
    this.ape1 = ape1;
    this.ape2 = ape2;
    this.anioNac = anioNac;
    }
}