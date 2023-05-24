
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        System.out.println("Pedir numero hasta que se introduzca uno negativo y calcular la media");
        
        float numero = 0f, suma = 0f, contador = 0f, media=0;
        
        do{
            
            numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
            
            if (numero >=0) {
                suma = suma + numero;
                contador++;
            }
            
            
        }while(numero >=0);
        media = suma/contador;
        JOptionPane.showMessageDialog(null, "La media de los numeros que ingreso es: " + media);
    }
    
}
