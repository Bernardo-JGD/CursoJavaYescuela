
package Arreglos;


public class Arreglo {
    
    public static void main(String[] args) {
        
        int []numeros = new int [3];
        int []numeros2 = {5, 7, 9, 10};
        numeros [0] = 7;
        numeros [1] = 10;
        numeros [2] = 13;
        
        
        
        System.out.println(numeros [0]);
        System.out.println(numeros [1]);
        System.out.println(numeros [2]);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Arreglo 1--- " + numeros[i]);
            
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Arreglo 2--- " + numeros2[i]);
        }
        
    }
    
}
