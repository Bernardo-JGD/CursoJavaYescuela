
package Ejercicio3;

import java.util.Scanner;
public class Principal {
    
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        
        Vehiculo v[] = new Vehiculo [20];
        
        
        int sino, opcion, mas_auto;
        String marca, modelo;
        float precio;
        int contador_vehiculos = 0;
        
        do{
            System.out.println("1.Ingresar nuevo vehiculo   2.Mostrar todos los vehiculos  3.Mostrar el vehiculo más barato");
            System.out.println("Ingrese el numero de la opcion que desea ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1 :
                    do{
                        leer.nextLine ();
                        System.out.println("Ingrese la marca");
                        marca = leer.nextLine ();
                        System.out.println("Ingrese el modelo");
                        modelo = leer.nextLine ();
                        System.out.println("Ingrese el precio");
                        precio = leer.nextFloat ();
                        
                        v[contador_vehiculos] = new Vehiculo (marca, modelo, precio);
                        
                        contador_vehiculos++;
                        System.out.println("¿Desea ingresar un nuevo vehiculo?");
                        System.out.println("1.Si    2.No");
                        mas_auto = leer.nextInt();
                    }while (mas_auto != 2);
                    break;
                    
                case 2 :
                    
                    mostrar(v, contador_vehiculos);
                    
                    break;
                    
                case 3 :
                    System.out.println("El Vehiculo más barato registrado");
                    System.out.println(v[mas_bara(v, contador_vehiculos)].mas_barato());
                    break;
                    
                default : 
                    
                    System.out.println("Esa opcion no existe");
                    break;
            }
            
            System.out.println("¿Desea regresar al menu principal?");
            System.out.println("1.Si        2.No");
            sino = leer.nextInt();
        }while (sino != 2);
        
    }
    
    public static int mas_bara (Vehiculo v[], int contador_vehiculos){
        int mas_barato_pos = 0;
        float precio_bara = v[0].getPrecio();
        
        for (int i = 1; i < contador_vehiculos; i++) {
            if (v[i].getPrecio() < precio_bara) {
                precio_bara = v[i].getPrecio();
                mas_barato_pos = i;
            }
        }
        
        return mas_barato_pos;
    }
    
    public static void mostrar (Vehiculo v[], int contador){
        System.out.println("Lista de Vehiculos registrados");
        for (int i = 0; i < contador; i++) {
            System.out.println("Marca: " + v[i].getMarca());
            System.out.println("Modelo: " + v[i].getModelo());
            System.out.println("Precio: " + v[i].getPrecio());
            System.out.println("");
        }
    }
    
}
