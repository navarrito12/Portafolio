public class Robot
{
    private static int contador=0;      // Nº de robots creados
    private int numero;                 // AUTOINCREMENTADO
    private char direccion;             // N {N,E,S,O}
    
    public Robot() {
        System.out.printf("%d\n", (int)direccion);
        numero=++contador;  
        setDireccion('N');
        System.out.printf("%d\n", (int)direccion);
    }
    
    public void setDireccion(char dir) {
        // TODO: assert
        int x;
        x=3;
        this.direccion=dir;
        int y=x+1;
    }
    
    public void m1() {
        // dir='S';         <- Error
    }
    
    public String toString() {
        return "Robot %d".formatted(numero);
    }
}