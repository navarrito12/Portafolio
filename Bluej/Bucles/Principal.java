import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal 
{
    public static void main (String[] args) {
        // m1(5);
        // m2(10);
        // m3(7);
        m4(20);
    }
    
    private static void m4(int n) {
        /* for (int i=1, j=1; i*j<n; i++, j++)
            System.out.printf("i=%d j=%d\n", i ,j); */
        /* for (int i=1, j=n; i<j; i++, j--)
            System.out.printf("i=%d j=%d\n", i ,j); */
        /* for (int i=1, j=n; i<j; i*=2, j/=2)
            System.out.printf("i=%d j=%d\n", i ,j); */
        for (int i=1, j=n, contador=1; i<j; i*=2, j/=2, contador++)
            System.out.printf("#%d i=%d j=%d\n", contador, i ,j);
    }
    
    //for de una variable
    private static void m3(int n) {
        // De 1 a n
        /* for (int i=1; i<=n; i++)
            System.out.printf("Iteración %d de %d\n", i, n); */
            
        // De n a 1
        /* for (int i=n; i>=1; i--) {
            String texto1="Iteración %d de %d".formatted(n-i+1, n);
            System.out.printf("Iteración %d de %d\n", n-i+1, n);
            System.out.printf("i=%d n=%d\n", i, n);
            System.out.println("-".repeat(texto1.length()));
        } */
        
        for (int i=1; i<=n/2; i++, saludar())
            System.out.println(i);
    }
    
    private static void saludar() {
        System.out.println("Hola");
    }
    
    //  do-while
    //  Adivinanza de un número entre 1 y max
    //  TODO; controlar que el número introducido por el usuario esté en el rango [1-max]
    private static void m2(int max) {
        int pensado=(int)(Math.random()*max)+1;
        System.out.printf("Adivina el número que he pensado [1-%d]\n", max);
        
        Scanner sc=new Scanner(System.in);
        int numero=0;
        boolean adivinado=false;
        do {
            try {
                System.out.printf("Escribe un número en el rango [1-%d]:", max);
                numero=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.printf("Debe introducir un número entero en el rango [1-%d]\n", max);
                sc.nextLine();      // Limpiamos el buffer
            }
            adivinado=numero==pensado;
            if (!adivinado)
                if (pensado<numero)
                    System.out.printf("El número que he pensado es menor que %d\n", numero);
                else
                    System.out.printf("El número que he pensado es menor que %d\n", numero);
        } while (!adivinado);
        System.out.printf("¡Enhorabuena! Has adivinado el número que pense. Era el %d\n", pensado);
    }
    
    // while
    private static void m1(int n) {
        int i=1;
        while(i<=n) {
            System.out.printf("i=%d\n", i);
            i++;
        }
    }
}