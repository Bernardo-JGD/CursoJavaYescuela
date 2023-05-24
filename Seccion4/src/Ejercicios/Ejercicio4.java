
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        System.out.println("Pedir numero hasta que se teclee uno negativo. ");
        System.out.println("Y mostrar cuantos se han introducido");
        
        int numero, contador=0, negacontador=0;
        
        do{
            
          numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
          
          
            if (numero>=0) {
                contador++;
            }else{
                negacontador++;
            }
          
          JOptionPane.showMessageDialog(null, "Van " + contador + " positvos" 
                  + "\n" 
                  + "Y van " + negacontador + " negativos");
            
        }while (numero>=0);
        JOptionPane.showMessageDialog(null, "Fin del ciclo");
    }
    
}
