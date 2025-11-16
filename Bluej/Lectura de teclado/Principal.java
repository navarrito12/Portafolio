import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca su peso (Kg) sin decimales: ");
        int peso=0;
        try {
            peso=sc.nextInt();
        } catch (InputMismatchException e) {            
            System.out.println("Has introducido un peso incorrecto");
            System.out.printf("El rango de números enteros es [%d,%d]\n", 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
            String resto=sc.nextLine();
            System.out.printf("Resto: %s\n", resto);
        }
        System.out.printf("Su peso es %d\n", peso);
        
        System.out.println("Introduzca su altura (cm) sin decimales: ");
        int altura=sc.nextInt();
        System.out.printf("Su altura es %d\n", altura);      
        
    }
}