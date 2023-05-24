
package MultiMatrices;

import java.util.Scanner;

public class MultiplicacionMatrices {
    //Multiplicación de matrices, logrado :3 
    int n = 3;
    int matriz1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int matriz2[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int matriz_resultante[][] = new int [3][3];
    
    public static void main(String[] args) {
        
        MultiplicacionMatrices mm = new MultiplicacionMatrices ();
        Scanner leer = new Scanner(System.in);
        
        mm.mostrarMatricesRellenas();
        System.out.println("");
        mm.multi();
        System.out.println("");
        mm.mostrarMR();
        
    }
    
    public void multi (){
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    
                    suma = suma + (matriz1[i][k] * matriz2[k][j]);
                    System.out.println("i = " + i + "\nj = " + j + "\nk = " + k);
                    System.out.println("");

                    if (k == 2) {
                        matriz_resultante[i][j] = suma;
                        System.out.println("suma = " + matriz_resultante[i][j]);
                        System.out.println("");
                        suma = 0;
                    }
                    
                     
                    
                }   
            }
        }
        
    }
    
    public void mostrarMatricesRellenas (){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
    public void mostrarMR(){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz_resultante[i][j] + "]");
                
            }
            System.out.println("");
        }
        
    }
    
    
    
    
    
}
