
package Condicionales.Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        
        
        System.out.println("En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los $300");
        System.out.println("¿Cual sera la cantidad que pague una persona por su compra");
        
        double pago, aux;
        
        pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su compra"));
        aux = pago;
        if  (pago>300) {
            pago = pago*0.80;
            
            JOptionPane.showMessageDialog(null, "Su compra fue de: " + aux + "\n" + " Descuento de 20%: pagara--- " + pago);
            
        }else{
            JOptionPane.showInputDialog(null, "No alcanza desucento \n" + "Paga: " + "$ " + aux);
        }
        
    }
    
}
