public class Principal
{
    public static void main(String[] args)  {
        Bola b1=new Bola(Color.ROJO);
        Bola b2=new Bola(Color.VERDE);
        System.out.println("Bola 1="+b1);
        System.out.println("Bola 2="+b2);
        System.out.printf("¿El color de la bola 1 es AMARILLO? %s\n",
            b1.getColor().equals(Color.AMARILLO) ? "SI" : "NO");
        System.out.printf("¿El color de la bola 2 es %s? %s\n",
            Color.VERDE,
            b2.getColor().equals(Color.VERDE) ? "SI" : "NO");
    }
}