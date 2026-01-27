public class Animal {
    private static int contador=0;
    private int numero;
    private String apodo;
    private int peso;
    private boolean estaVivo;

    public Animal() {
    }

    public Animal(String apodo) {
        this.apodo = apodo;
    }

    public Animal(String apodo, int peso) {
        this.apodo = apodo;
        this.peso = peso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("numero=").append(numero);
        sb.append(", apodo='").append(apodo).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", estaVivo=").append(estaVivo);
        sb.append('}');
        return sb.toString();
    }
}
