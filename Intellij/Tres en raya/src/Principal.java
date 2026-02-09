import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Tablero t1=new Tablero();
        // Llenamos el tablero de X
        for (int i = 0; i < t1.getFilas() ; i++)
            for (int j = 0; j < t1.getColumnas(); j++)
                t1.colocar(new Ficha(TipoFicha.X), new Coordenada(i,j));
        System.out.println(t1);
        System.out.printf("¿Está completo el tablero? %s\n", t1.estaCompleto());
        System.out.printf("¿Hay línea horizontal? %s\n", t1.horizontales());
    }
}
