
package Condicionales;

import javax.swing.JOptionPane;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        
        mensaje = (numero%2 == 0) ? "Es par" : "No es par";
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        // otra forma de hacerlo
        
        int otronumero;
        otronumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, (otronumero%2 != 0) ? "es impar" : "es par");
        
    }
    
}
