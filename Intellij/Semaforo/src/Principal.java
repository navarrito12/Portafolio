import java.util.HashMap;

import static java.lang.Thread.sleep;

public class Principal {
    public static void main(String[] args) {
        HashMap<Color,Integer> tiempos=new HashMap<>();
        tiempos.put(Color.ROJO, Semaforo.T1);
        tiempos.put(Color.VERDE, Semaforo.T2);
        tiempos.put(Color.AMARILLO, Semaforo.T3);

        Semaforo s1=new Semaforo();

        // Cambios de color por tiempo
        System.out.println(s1);
        for (int i = 1; i <= 3 ; i++) {
            pausa(tiempos.get(s1.getColor()));
            s1.cambiar();
            System.out.println("El semáforo cambia a color "+s1.getColor());
        }

        // Cambios de color pulsando el botón
        System.out.println(s1);
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Pulso el botón");
            try {
                s1.pulsarBoton();
            } catch (Exception e) {
                System.out.println("No se debe pulsar el botón cuando el semáforo está en color AMARILLO");
                s1.cambiar();
            }
            System.out.println("El semáforo cambia a color "+s1.getColor());
        }
    }

    private static void pausa(int tiempo) {
        try {
            System.out.printf("Pausa de %d segundos\n", tiempo);
            sleep(tiempo*1000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
