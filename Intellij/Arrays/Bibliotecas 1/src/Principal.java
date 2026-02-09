import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class Principal {
    public static void main(String[] args) {
//        AnsiConsole.systemInstall();
        Ansi a1=new Ansi();
        System.out.println(a1.fgBrightGreen().a("Hola a todos").reset());
//        AnsiConsole.systemUninstall();
    }
}
