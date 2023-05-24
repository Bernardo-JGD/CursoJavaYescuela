
package Matrices;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Definicion {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int matriz [][] = {{1, 2, 3}, {4, 5, 6}, {7 ,8, 9}};
        System.out.println("La matriz es");
        for (int i = 0; i < 3; i++) {//numero de filas 
            for (int j = 0; j < 3; j++) {//numero de columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        int filas, columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        
        System.out.println("Ingrese los elementos de la matriz");
        int matriz1[][] = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("i = " + i + "   " + "j = " + j);
                matriz1[i][j] = leer.nextInt();
            }
        }
        System.out.println("La matriz es");
        for (int i = 0; i < filas; i++) {//numero de filas 
            for (int j = 0; j < columnas; j++) {//numero de columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
}
