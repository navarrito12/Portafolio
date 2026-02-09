import org.fusesource.jansi.Ansi;

import java.util.Arrays;

public class Urna
{
    private Bola[] bolas;
   
    public Urna(int capacidad) {
        assert capacidad>=1: "La capacidad de una urna debe ser >=1 [capacidad=%d]"
                .formatted(capacidad);
        bolas=new Bola[capacidad];
    }
    
    public void agregar() {
        agregar(Bola.generar());
    }
   
    public void agregar(Bola bola) {
        assert bola!=null: "La bola a agregar a la urna no puede ser nula";
        assert !estaLlena(): 
            "La urna está llena. No es posible agregar la bola %s".formatted(bola);
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]==null) {
                bolas[i] = bola;
                break;
            }
    }
    
    public void agregar(Color color) {
        assert color!=null: "El color de la bola a agregar no puede ser nulo";        
        agregar(new Bola(color));
    }
   
    public boolean estaLlena() {
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]==null)
                return false;
        return true;
    }
   
    public boolean estaVacia() {
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]!=null)
                return false;
        return true;
    }
    
    public int getCapacidad() {
        return bolas.length;
    }
   
    public void llenar() {
        while (!estaLlena())
            agregar(Bola.generar());
    }
    
    public int numBolas() {
        int contador=0;
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]!=null)
                ++contador;
        return contador;
    }

    public Bola sacar() {
        assert !estaVacia(): "La urna está vacía. No es posible sacar una bola";

        int[] posBolas=new int[numBolas()];
        int contador=0;
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]!=null) {
                posBolas[contador] = i;
                contador++;
            }
        int posAleatoria=(int)(Math.random()*posBolas.length);
        int pos=posBolas[posAleatoria];
        Bola sacada=bolas[pos];
        bolas[pos]=null;
        return sacada;
    }
   
    public Bola sacar(Color color) {
        assert color!=null: "El color de la bola a sacar de la urna no puede ser nulo";
        assert !estaVacia(): 
            "La urna está vacía. No es posible sacar una bola de color %s".formatted(color);
        Bola sacada=null;
        for (int i = 0; i < getCapacidad() ; i++)
            if (bolas[i]!=null && bolas[i].getColor().equals(color)) {
                sacada=bolas[i];
                bolas[i]=null;
                break;
            }
        return sacada;
    }
    
    public void vaciar() {
        Arrays.fill(bolas, null);
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder();
        final String barra= Ansi.ansi().fgBrightBlue().a("|").reset().toString();
        for (int i = 0; i < getCapacidad() ; i++) {
            sb.append(barra);
            sb.append(bolas[i] == null ? " " : bolas[i]);
        }
        sb.append(barra);
        return "%s %d/%d %s"
            .formatted( sb.toString(),
                        numBolas(),
                        getCapacidad(), 
                        (estaVacia() ? "VACIA" : "") + (estaLlena() ? "LLENA" : ""));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}