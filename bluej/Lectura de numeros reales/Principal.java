import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca su peso (Kg) con decimales: ");
        double peso=0;
        try {
            peso=sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Has introducido un peso incorrecto");
            String resto=sc.nextLine();
            System.out.printf("Resto: %s\n", resto);
        }
        System.out.printf("Su peso es %.2f\n", peso);       
    }
}