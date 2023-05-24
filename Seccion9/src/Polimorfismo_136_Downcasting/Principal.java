
package Polimorfismo_136_Downcasting;


public class Principal {
    
    /*
            El downcasting es que un convertir o almacenar un objeto de la superclase en un objeta de alguna subclase. 
            
            Para poder hacer esto primero se debio haber hecho un upcasting 
    */
    
    public static void main(String[] args) {
        //primero hacemos el upcasting
        //Primero declaramos o referenciamos el objeto como de la superclase, luego lo instanciamos sobrecargando 
        //el constructor 
        Vehiculo vehiculo = new VehiculoDeportivo ("GH89", "Audi", "HI9", 500);
        System.out.println(vehiculo);
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
        System.out.println(nuevoVehiculo);
        
    }
    
}
