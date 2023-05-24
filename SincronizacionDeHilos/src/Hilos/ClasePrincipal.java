
package Hilos;

public class ClasePrincipal {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1 ();
        Hilo2 h2 = new Hilo2 ();
        Hilo3 h3 = new Hilo3 ();
        Hilo4 h4 = new Hilo4 ();
        
        //hilo1
        h1.start();
        try{
            h1.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo 1: " + e);
        }
        
        //hilo2
        h2.start();
        try{
            h2.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo 2: " + e);
        }
        
        //hilo3
        h3.start();
        try{
            h3.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo 3: " + e);
        }
        
        //hilo4
        h4.start();
        try{
            h4.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo 4: " + e);
        }
        
    }
}
