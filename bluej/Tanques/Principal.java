public class Principal
{
   public static void main(String[] args) {
       Tanque t1=new Tanque();
       Tanque t2=new Tanque(10,5);
       Tanque t3 = new Tanque(1, 1, 'S');
       
       System.out.printf("t1 %s - t2 %s\n", t1, t2);
       
       System.out.println("PRUEBA DE GIRAR EN T1");
       t1.girar(); // N -> E
       System.out.printf("t1 (E) : %s\n", t1);
       t1.girar(); // E -> S
       System.out.printf("t1 (S) : %s\n", t1);
       t1.girar(); // S -> O
       System.out.printf("t1 (O) : %s\n", t1);
       t1.girar(); // O -> N
       System.out.printf("t1 (N) : %s\n", t1);
       
       System.out.println("PRUEBA DE AVANZAR EN T3");
       t3.girar(); // S -> O
       System.out.printf("t3 (O) : %s\n", t3);
       t3.avanzar(2); // De (1,1) a (1,-1) (aunque la assert falla si se ejecuta)
       System.out.printf("t3 movido: %s\n", t3);
   }
}