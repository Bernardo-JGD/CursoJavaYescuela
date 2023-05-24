
package Condicionales_y_Bucles;


public class Ejercicio_11_1 {
    //11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
    //como viene en el pdf 
    public static void main(String[] args) {
        
        long producto = 1;
        //producto guardara la multiplicacion de los 10 primeros numeros impares
        //es muy importante de acordarse de inicializarlo a 1, ya que si lo hacemos a 0 
        //el producto siempre valdrá 0
        
        for (int i = 1; i < 20; i+=2) {
            producto = producto * i;
        }
        System.out.println(producto);
        
    }
    
}
