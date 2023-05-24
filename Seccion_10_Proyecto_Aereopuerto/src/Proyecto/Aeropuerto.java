
package Proyecto;


public class Aeropuerto {
    
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompania[] = new Compania[10];
    private int numCompania;//este es un iterador, solo me dice el numero de compania que ha sido registrada 
    
    public Aeropuerto (String nombre, String ciudad, String pais){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompania = 0 ;//inicializo el contador de la lista de companias 
    }
    public Aeropuerto (String nombre, String ciudad, String pais, Compania c[]){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompania = c;
        this.numCompania = c.length ; 
    }
    
    public void InsertarCompania (Compania compa){
        listaCompania [numCompania] = compa;
        numCompania++;
    }
    
    
    
    public String getNombre (){
        return nombre;
    }
    public String getCiudad (){
        return ciudad;
    }
    public String getPais (){
        return pais;
    }
    //cuando declaro un getter de tipo arreglo, tengo que ponerlo de la siguiente manera
    //tipo_de_accesi tipo_de_dato []getNombreDelAtributo (){}
    public Compania []getListaCompania (){
        return listaCompania;
    }
    public int getNumCompania (){
        return numCompania;
    }
    
    public Compania getCompania (int i){
        return listaCompania[i];
    }
    public Compania getCompania (String nombre){
        Compania c = null;
        for (int i = 0; i < numCompania; i++) {
            if (listaCompania[i].getNombre().equals(nombre)) {
                c = listaCompania[i];
            }
        }
        return c;
    }
    
    
}
