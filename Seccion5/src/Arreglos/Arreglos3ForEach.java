
package Arreglos;

public class Arreglos3ForEach {
    
    public static void main(String[] args) {
        
        String nombres [] = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Roberto", "Flor", "Jessica"};
        
        System.out.println("Mostrar los nombres poniendo el tamaño en el for manualmente");
        for (int i = 0; i < 6; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("Mostrando pero con .length");
        System.out.println("Es para cuando no conozco el tamaño del arreglo");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        //------------------for each
        
        /*---------Estructura
        // en el  nombre del iterador solo sirve como variable momentanea dentro del for
        for (Tipo_de_dato    nombre_del_iterador : nombre_del_arreglo ){
              
                //los datos del arreglo se muestran solo poniendo el nombre del iterador
                System.out.println (i);
        }
        
        */
        
        System.out.println("Con for each");
        for (String i : nombres){
            System.out.println("NOMBRES--- " + i);
        }
        
    }
    
}
