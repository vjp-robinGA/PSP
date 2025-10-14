package Hilo2;

/**
 * @author Robin
 */
public class LanzaHilosConEspera {

    public static void main(String[] args){

        Thread h1 = new Thread(new Hilo("H1"));
        Thread h2 = new Thread(new Hilo("H2"));
        Thread h3 = new Thread(new Hilo("H3"));
        Thread h4 = new Thread(new Hilo("H4"));

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        
        try{
            
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            
        }
        catch (InterruptedException e1){
            e1.printStackTrace();
        }

        System.out.println("Hilo principal terminado");

    }

}
