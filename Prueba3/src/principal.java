
/**
 * @author Robin
 */
import java.util.ArrayList;
import java.util.List;

public class principal {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();  // Declaramos un
        //array con tamaño fijo de 5 elementos
        List<Thread> hilosGeneradores = new ArrayList<>();
        Integer NUM_HILOS = 8;

        for (int i = 0; i < NUM_HILOS; i++) {
            numeros.add(null);
        }

        //Creamos y lanzamos los hilos
        for (int i = 0; i < NUM_HILOS; i++) {
            Thread hilo = new Thread(new generador(numeros, i));
            hilosGeneradores.add(hilo);
            hilo.start();
        }

        //Esperan al hilo final
        for (Thread hilo : hilosGeneradores) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Creamos y lanzamos el hilo combinador
        Thread combinador = new Thread(new combinador(numeros));
        combinador.start();

    }
}
