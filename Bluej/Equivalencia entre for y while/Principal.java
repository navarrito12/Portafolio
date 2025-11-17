public class Principal
{
    public static void main(String[] args) {        
        m1();
        m2();
    }
    
    // for
    private static void m1() {
        System.out.println("for");
        for (int i=1; i<=5; i++)
            System.out.print(i+" ");
        System.out.println();
    }
    
    // while
    private static void m2() {
        System.out.println("while");
        int i=1;
        while (i<=5) {
            System.out.print(i+" ");    
            i++;
        }
        System.out.println();
    }    
}