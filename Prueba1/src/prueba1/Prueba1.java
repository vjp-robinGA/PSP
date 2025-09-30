package prueba1;

import java.io.IOException;

/**
 * @author Robin
 */
public class Prueba1 {

    public static void main(String[] args) {
        
        String command = "ls";
        
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        
        try{
            
            Process process = processBuilder.start();
            
            int exitCode = process.waitFor();
            
            System.out.println("Codigo de salida: " + exitCode);
            
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
        
    }

}
