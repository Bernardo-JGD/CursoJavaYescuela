
package DatosVentana;

import javax.swing.JOptionPane;


public class Optionpane {
    
    public static void main (String[] args){
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: " );
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        letra = JOptionPane.showInputDialog("Disite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero con decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
    }
    
}
