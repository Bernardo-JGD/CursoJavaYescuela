
package Ejercicios;


import java.util.Scanner;
public class Ejercicio3punto1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Crear y cargar una matriz de 3x3, transponerla y mostrarla");
        System.out.println("Ingrese los elementos de una matriz 3x3");
        int matriz[][] = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("La matriz transpuesta es");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
