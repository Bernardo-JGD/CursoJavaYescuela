
package Clases;


public class Proceso extends Thread{
    
    int num_int;
    
    public Proceso (String nombrehilo){
        
        super (nombrehilo);
        
        
    }
    
    @Override
    public void run (){
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + getName());
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion (int valor){
        num_int = valor;
    }
    
}
