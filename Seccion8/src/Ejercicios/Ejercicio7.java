
package Ejercicios;


public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        System.out.println("Crear una matriz marco de tamao 5x5. Todos sus elementos deben ser 0 salvo sus bordes ");
        System.out.println("que deben ser 1. Mostrarlo");
        
        int matriz[][] = new int[5][5];
        int f = 5, c = 5;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0) {
                    matriz[i][j] = 1;
                }
                if (i ==f-1) {
                    matriz[i][j] = 1;
                }
                if (j == 0) {
                    matriz[i][j] = 1;
                }
                if (j == c-1) {
                    matriz[i][j] = 1;
                }
            }
        }
        System.out.println("La matriz marco es la siguiente");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
