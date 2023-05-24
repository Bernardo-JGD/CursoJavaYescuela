
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("Leer numero hasta que se introduzca un 0.");
        System.out.println("Para cada uno indicar si es par o impar");
        
        
        int numero;
        
        do{
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            if (numero%2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es par");
            }else{
                if (numero%2 != 0  ) {
                    JOptionPane.showMessageDialog(null, "El numero " + numero + " es impar");
                    
                }
                   
                    
                
                
            }
            
        }while (numero!=0);
        JOptionPane.showMessageDialog(null, "El numero es " + 0 + ".\nFin del ciclo");
        
        
        
    }
    
}
