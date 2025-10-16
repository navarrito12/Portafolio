public class Principal
{
   public static void main(String[] args) {
       Tanque t1=new Tanque();
       Tanque t2=new Tanque();
       System.out.printf("t1 %s - t2 %s\n", t1, t2);
       t1.setDireccion('S');
       // t2.setDireccion('X');
       System.out.printf("t1 %s - t2 %s\n", t1, t2);             
       t2.setDireccion('A');
       System.out.printf("t1 %s - t2 %s\n", t1, t2);
       t2.avanzar(3);
       System.out.printf("t1 %s - t2 %s\n", t1, t2);
   }
}