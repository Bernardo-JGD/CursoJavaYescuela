
package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que lear un caracter por teclado y compruebe si es una letra mayuscula");
        
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "'"+ letra + "'" + " es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "'"+ letra + "'" + " es una letra minuscula");
        }
        
    }
    
}
