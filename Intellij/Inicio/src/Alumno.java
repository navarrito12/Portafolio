public class Alumno {
    private static int contador=0;
    private int numero;
    private String nombre;
    private String ape1;
    private String ape2;

    public Alumno(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", ape1='").append(ape1).append('\'');
        sb.append(", ape2='").append(ape2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
