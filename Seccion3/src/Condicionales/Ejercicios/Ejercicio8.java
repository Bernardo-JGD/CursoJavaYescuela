
package Condicionales.Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        System.out.println("Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene");
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero <10 ) {
            JOptionPane.showMessageDialog(null, "EL numero " + numero + " tiene 1 digito");
        }else{
            if (numero<100) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene 2 digitos");
            }else{
                if (numero <1000) {
                    JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene 3 digitos");
                }else{
                    if (numero < 10000) {
                        JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene 4 digitos");
                    }else{
                        if (numero < 100000) {
                            JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene 5 digitos");
                        }
                    }
                }
                   
            }
        }
        
    }
    
}
