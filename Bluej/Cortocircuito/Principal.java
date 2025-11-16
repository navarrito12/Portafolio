public class Principal
{
    public static void main(String [] args) {
        int a=6;
        int false=2;
        boolean b1=a>5 || saludar();
        System.out.printf("b1=%b\n", b1);
        boolean b2=a>5 && saludar();
        System.out.printf("b2=%b\n", b2);
    }
    
    private static void saludar () {
        System.out.println("Hola" + s);
        return true;
    }
}