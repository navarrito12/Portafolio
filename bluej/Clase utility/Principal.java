public class Principal
{
    public static void main(String[] args) {
        /* Util u1=new Util();
        int x=Util.sumar(Util.restar(5,2), 4);
        System.out.println(x); */
        int resultadoResta = Util.restar(5, 2);
        int resultadoFinal = Util.sumar(resultadoResta, 4);
        // System.out.println("Resultado Final de la operación: " + resultadoFinal);
    }
}