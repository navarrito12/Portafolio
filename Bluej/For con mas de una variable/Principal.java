public class Principal
{
    public static void main(String[] args)  {
        // m2();
        m3();
    }
    
    //for con dos variables
    private static void m2()  {
        for (char i='a', j='h'; i<j; i++, j--)  
            System.out.printf("i=%c j=%c\n", i, j);   
    }
    
    //for con tres variables
    private static void m3()  {
        int contador=1;
        for (int i=0, j=5, k=10; i+j+k<=50; i++, j*=3, k/=2, contador++)
            System.out.printf("#=%d\ti=%d\tj=%d\tk=%d\n", contador, i, j, k);
    }
}