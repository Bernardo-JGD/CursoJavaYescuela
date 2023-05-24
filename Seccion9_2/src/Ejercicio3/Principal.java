
package Ejercicio3;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String marca, modelo;
        float precio;
        
        int cantidad_vehiculos, indice_coche_bara;
        
        System.out.println("Ingrese la cantidad de vehiculos");
        cantidad_vehiculos = leer.nextInt();
        
        Vehiculo coches[] = new Vehiculo [cantidad_vehiculos];
        
        
        for (int i = 0; i < coches.length; i++) {
            leer.nextLine();
            System.out.println("Ingrese los datos del coche " + (i+1));
            System.out.println("Ingrese la marca");
            marca = leer.nextLine();
            System.out.println("Ingrese el modelo");
            modelo = leer.nextLine();
            System.out.println("Ingrese el precio");
            precio = leer.nextFloat();
            coches[i]  = new Vehiculo (marca, modelo, precio);
            
        }
        indice_coche_bara = indice_coche_m_barato(coches);
        System.out.println("El coche más barato es: ");
        System.out.println(coches[indice_coche_bara].mostrar_datos());
        
        
    }
    
    public static int indice_coche_m_barato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio()< precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
        
    }
    
}
