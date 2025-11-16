import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static util.Util.max;
import static util.Util.sumar;

public class Principal
{
    public static void main(String[] args) {
        double m=min(pow(2,21), sqrt(1048576));
        double x=PI*E;
        System.out.println(min(m, x));
        // System.out.println(util.Util.sumar(2,4));
        System.out.println(sumar(2,4));
        System.out.println(max(2,4));
    }
}