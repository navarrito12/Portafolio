public class Principal
{
   public static void main(String[] args) {
       m1(5);    
   }
   
   // for
   private static void m1(int n) {
       for (int i=1; 
               i<=n; 
                   i++)
           System.out.printf("Iteración %d de %d\n", i, n);
   }
}