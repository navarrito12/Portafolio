public class Principal
{
    public static void main(String[] args) {
        a();
    }
    
    private static void a(){
        System.out.println(b(1));
        //int x=b(1);
        // println(x)
    }
    
    private static int b(int x) {
        --x;
        return c(x);
    }
    
    private static int c(int x) {
        --x;
        return x;
    }
}