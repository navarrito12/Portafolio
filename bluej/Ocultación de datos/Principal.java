public class Principal
{
    public static void main(String[] args) {
        Animal a1=new Animal("LOLI");
        Animal a2=new Animal("SUSI");
        System.out.println(a1.getPeso());
        // a1.setPeso(-1);
        a1.setPeso(700);
        a2.setPeso(800);
        System.out.println("Peso de "+a1.getApodo()+"="+a1.getPeso());
        System.out.println(a1);
        System.out.println("Peso de "+a2.getApodo()+"="+a2.getPeso());
        System.out.println(a2);
        String texto1="Las mejores gatas son: "+a1+" y "+a2;
        String texto2=String.format("Las mejores gatas son: %s y %s", a1, a2);
        String texto3="Las mejores gatas son: %s y %s".formatted(a1, a2);
        System.out.println(texto1+"\n"+texto2);
    }
}