
package Polimorfismo_134_Trabaja_con_Herencia;


public class Principal {
    
    public static void main(String[] args) {
        /*
            El polimorfismo se comporrta de la siguiente manera
            
            Yo creo un arreglo de objetos de la superclase en este caso,  
            y a cada posicion cuando la cree, como cada posicion es un objeto, 
            yo puedo declararla del tipo de cada una de las clases hijas
            y solo tendria que sobrecarga el constructor con los datos que hereda de las superclase
            más los datos propios de cada clase hija
        */
        Vehiculo misvehiculos[] = new Vehiculo[4];
        
        misvehiculos [0] = new Vehiculo ("GH67", "Ferrari", "A89");
        misvehiculos [1] = new VehiculoTurismo ("78HJ", "Audi", "P14", 4);
        misvehiculos [2] = new VehiculoDeportivo ("45GH", "Toyota", "KJ8", 500);
        misvehiculos [3] = new VehiculoFurgoneta ("JI8", "Toyota", "J9", 2000);
        
        for (Vehiculo vehiculos : misvehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
    }
    
}
