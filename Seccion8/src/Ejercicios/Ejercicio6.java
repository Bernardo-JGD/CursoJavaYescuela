
package Ejercicios;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Utilizando dos matrices de 5x9 y 9x5, cargar la primera y transponer en la segunda");
        
        
        int matriz[][] = new int[5][9];
        int matriz_t[][] = new int[9][5];
        int num = 0;
        System.out.println("La matriz original es");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = ++num;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz_t [j][i]= matriz[i][j];               
            }
        }
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz_t[i][j] + "]");
            }
            System.out.println("");
        }
        
         
    }
    
}
