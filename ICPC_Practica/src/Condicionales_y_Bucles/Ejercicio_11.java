
package Condicionales_y_Bucles;


public class Ejercicio_11 {
    //11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
    //como yo lo entndi 
    public static void main(String[] args) {
        
        long producto_impar=1;
        
        for (int i = 1; i < 20; i++) {
            if ( i%2 != 0) {
                producto_impar = producto_impar*i;
            } 
        }
        System.out.println("El producto de los 10 primeros numeros impares es: " + producto_impar);
        
    }
    
}
