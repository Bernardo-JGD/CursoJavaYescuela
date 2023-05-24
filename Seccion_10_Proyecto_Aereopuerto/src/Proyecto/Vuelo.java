
package Proyecto;


public class Vuelo {
    
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];
    
    public Vuelo (String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros){
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        //siempre el numero actual de pasajeros al crear un vuelo es 0 
        this.numActualPasajeros = 0;
        //el tamaño de las lista de pasajeros esta determinada por el numero maximo de pasajeros 
        //por eso inicializo de esta manera este atributo en el constructor
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }
    
    public String getIdentificador (){
        return identificador;
    }
    public String getCiudadOrigen (){
        return ciudadOrigen;
    }
    public String getCiudadDestino (){
        return ciudadDestino;
    }
    public double getPrecio (){
        return precio;
    }
    public int getNumMaxPasajeros (){
        return numMaxPasajeros;
    }
    public int getNumActualPasajeros (){
        return numActualPasajeros;
    }
    
    //con este metodo agrego pasajeros a la lista
    //teniendo ya creado un pasajero, lo selecciono y lo mando como parametro a este metodo
    //el cual, tomando la cantidad actual de pasajeros, lo colocara en el utltimo espacio disponible
    //si esta llena la lista, no se puede insertar
    //el numero actual de pasajeros no puede ser mayor al numero maximo de pasajeros
    public void insertarPasajero (Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }
    //este es para obtener el pasajero que quier
    //recibe de parametro un indice de iterador que se obtendra proporcionandolo el usuario 
    public Pasajero getPasajero (int i){
        return listaPasajeros[i];
    }
    
    public Pasajero getPasajero (String pasaporte){
        //declaro un objeto tipo pasajero
        Pasajero pas = null;
        for (int i = 0; i < numActualPasajeros; i++) {
            //checo si el pasaporte que ingreso el usuario es igual a algun pasaporte de algun usuario ya registrado
            if (pasaporte.equals(listaPasajeros[i].getPasaporte())) {
                //si se cumple la condicion, el objeto creado va a ser igual al objeto encontrado
                pas = listaPasajeros[i];
            }
        }
        //en el menu habria dos opciones
        //si retorna null, el pasajero no fue encontrado
        //si retorna algo diferente de null, quiere decir que el pasajero si fue encotrado con ese pasaporte 
        return pas;
    }
    
}
