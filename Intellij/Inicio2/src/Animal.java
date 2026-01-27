public class Animal {
    private String apodo;
    private int peso;

    public Animal(String apodo, int peso) {
        this.apodo = apodo;
        this.peso = peso;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getPeso() {
        return peso;
    }

    private    void comer() {
        System.out.println("Soy un animal que come");
          }

    public void saludar() {
        System.out.println("Hola soy un animal");
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("apodo='").append(apodo).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
