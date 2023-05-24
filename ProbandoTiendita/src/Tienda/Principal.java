
package Tienda;

import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ArrayList <Dulceria> Dulce;
        Principal prin = new Principal ();
        
        Dulce = new ArrayList <Dulceria> ();
        
    }
    
    public String Nombre (){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        return nombre;
    }
    public int Cantidad (){
        System.out.println("Ingrese cantidad");
        int cantidad = leer.nextInt();
        return cantidad;
    }
    public Double Precio (){
        System.out.println("Ingrese el precio");
        double precio = leer.nextDouble ();
        return precio;
    }
    public Double Ganancia (){
        System.out.println("Ingrese la ganancai inicial");
        double ganancia = leer.nextDouble ();
        return ganancia;
    }
    
    
}
