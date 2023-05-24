
package Ejercicios;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        //------------------------------------------------------------------------------ESTE ES EL DEL VIDEO
        System.out.println("Crear una matriz de tamaño nxm y decir si es simetrica o no");
        
        
        Scanner leer = new Scanner (System.in);
        
        int matriz1 [][], filas, columnas;
        boolean  simetrica = true;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        
        matriz1 = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = leer.nextInt();
            }
        }
        
        if (filas == columnas) {
            
            int i = 0, j;
            while ((i<filas) && simetrica == true){
                j = 0 ;
                while ((j<i) && (simetrica == true)){
                    if (matriz1[i][j] != matriz1[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
        
    }
    
}
