/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author ana_e
 */
public class Hilo3 extends Thread {
    
    
    
    @Override   
    public void run (){
        for (int i = 0; i <=5; i++) {
            System.out.print("E");
            
            try{
            Hilo3.sleep(1000);
            }catch (InterruptedException e){
                System.out.print("Error en el Hilo3: " + e);
            }
        }
    }
}
