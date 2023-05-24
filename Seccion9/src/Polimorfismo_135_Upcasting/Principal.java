
package Polimorfismo_135_Upcasting;

public class Principal {
    
    /*
        El upcasting no es más que hacer una conversion ascendente, 
        lo que significa que yo puedo convertir un objeto de la subclase 
        en un objeto de la superclase 
    
        La conversion ascendente de tipos: 
    
        crear un objeto de la subclase y guardarlo en un objeto de la superclase 
        
    */
    
    public static void main(String[] args) {
        //lo que esta antes del signo de igual es: la referencia de un objeto
        
        //lo que esta despues del signo de igual es la instanciacion del objeto  
        
        // y juntos los dos tenemos un objeto creado e inicializado 
        VehiculoTurismo miVehiculo = new VehiculoTurismo ("GT67", "Ferrari", "A89", 4);  
        Vehiculo vehiculo = miVehiculo;
        /*
            Las dos lineas anteriores se pueden escribir en una sola linea de la siguiente manera 
            Vehiculo vehiculo = new VehiculoTurismo ("GT67", "Ferrari", "A89", 4); 
        */
        
        System.out.println(miVehiculo);
        
    }
    
}
