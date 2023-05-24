
package Operadores;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class OperacionesOptionpane {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        float numero1, numero2;
        float suma, resta, multi, divi, resi;
        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: " ));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese otro numero: " ));
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        resi = numero1 % numero2;

        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta de los dos numeros es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion de los dos numeros es: " + multi);
        JOptionPane.showMessageDialog(null, "La division de los dos numeros es: " + divi);
        JOptionPane.showMessageDialog(null, "El residuo de los dos numeros es: " + resi);
        
        
        
        
    }
    
}
