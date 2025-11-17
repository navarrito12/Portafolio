public class Principal
{
   public static void main(String[] args) {
       // m2(); 
       m3(6);
   }
   
   private static void mostrar(String texto) {
       System.out.println(texto);    
       System.out.println("Elimino A antes de M");  
       System.out.println(m1(texto));
       System.out.println("-".repeat(3));      
   }
   
   // for con break y continue
   // Elimina las letras A que están antes de la primera letra M
   // Devuelve: la cadena sin las letras A (antes de la M)
   private static String m1(String s) {
       // TODO: validación de parámetros (no nulidad)
       String r="";
       char actual;
       boolean letraMEncontrada=false;
       for (int i=0; i<s.length(); i++) {
           actual=s.charAt(i);
           if (actual=='M')
               letraMEncontrada=true;
           else if (!letraMEncontrada && actual=='A')
               continue;           
           r+=actual;
       }
       return r;     
   }
   
   private static void m2() {
      String texto;
      // String texto=null;    // Nulo
      // mostrar(texto);
       
       texto="";                // Cadena vacía
       mostrar(texto);
       
       texto="PELO";            // Sin A ni M
       mostrar(texto);
       
       texto="PROGRAMACION";    // Con A y M
       mostrar(texto);
       
       texto="PATATA";          // Con A sin M
       mostrar(texto);
       
       texto="COMER";           // Con M sin A
       mostrar(texto);    
   }
   
   // for con break
   // Muestra todos los números pares antes del cuadrado de n desde el número 1
   private static void m3(int n) {       
       int cuadrado=(int)Math.pow(n,2);
       System.out.printf("Pares antes del cuadrado de %d (%d)\n", n, cuadrado);       
       for (int i=1; i<=Integer.MAX_VALUE; i++)
           if (i==cuadrado)                 // Si es n al cuadrado
               break;
           else if (i%2==0)                 // Es par
               System.out.print(i+" ");
   }
}