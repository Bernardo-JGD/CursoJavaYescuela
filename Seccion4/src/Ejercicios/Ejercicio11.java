
package Ejercicios;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        System.out.println("Diseñar un programa que muestre el producto de los primeros 10 numeros impares");
        
        int producto = 1;
        
        for (int i = 2; i <=20 ; i+=2) {
            producto = producto * (i-1);
        }
        System.out.println(producto);
    }
    
}
