
package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2 {
 
    public static void main(String[] args) {
        
        System.out.println("Pedir dos numeros y decir cual es el mayor o si son iguales");
        
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        
        
        
        if (numero1>numero2) {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es mayor que " + numero2);
        }else{
            if (numero1<numero2) {
                JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es mayor que " + numero1);
            }else{
                if (numero1== numero2) {
                    JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es igual que " + numero2);
                }
            }
        }
        
    }
    
}
