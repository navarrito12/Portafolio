import org.fusesource.jansi.Ansi;

public class Bola
{
    private static final char BOLA='\u2B24';    // ⬤
    private static int contador=0;              // Nº total de bolas
    private final int numero;                   // AUTO, >=1
    private final Color color;                  // NO NULO
    
    public Bola(Color color) {
        assert color!=null: "El color de una bola no puede ser nulo";
        numero=validarNumero(++contador);
        this.color=color;
    }
    
    private int validarNumero(int numero) {
        assert numero>=1: 
            "El número de bola debe ser >=1 [numero=%d]".formatted(numero);
        return numero;
    }
    
    public static Bola generar() {
        int aleatorio=(int)(Math.random()*3);    // Aleatorio [0-2]
        
        Color color=null;
        switch (aleatorio) {
            case 0: color=Color.AMARILLO; break;    
            case 1: color=Color.AZUL; break;    
            case 2: color=Color.ROJO; break;
            case 3: color=Color.VERDE; break;
            default:
                System.err.printf("Número aleatorio inesperado [aleatorio=%d]", aleatorio);
                System.exit(1);
        }

        return new Bola(color);
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public static int totalBolas() {
        return contador;
    }
    
    public String toString() {
        return Ansi.ansi().fg(color.getColorAnsi()).a(BOLA).reset().toString();
    }
}