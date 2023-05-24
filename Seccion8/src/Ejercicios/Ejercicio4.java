
package Ejercicios;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        System.out.println("Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal");
        System.out.println("principal sean 1 y el resto 0");
        
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz identidad es la siguiente");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
