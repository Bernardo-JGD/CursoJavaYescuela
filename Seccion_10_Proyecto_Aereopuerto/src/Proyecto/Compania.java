
package Proyecto;


public class Compania {
    
    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo = 0 ;
    
    public Compania (String nombre){
        this.nombre = nombre;
    }
    public Compania (String nombre, Vuelo v[]){
        this.nombre = nombre;
        listaVuelos = v;
        numVuelo = v.length;
    }
    
    public String getNombre (){
        return nombre;
    }
    public int getNumVuelo (){
        return numVuelo;
    }
    public Vuelo getVuelo (int i){
        return listaVuelos[i];
    }
    public Vuelo getVuelo (String id){
        boolean encontrado = false;
        Vuelo v = null;
        for (int i = 0; i < numVuelo; i++) {
            if (listaVuelos[i].getIdentificador().equals(id)) {
                encontrado = true;
                v = listaVuelos[i];
            }
        }
        return v;
    }
    
    public void insertarVuelo (Vuelo vuelo){
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }
    
    
    
    
}
