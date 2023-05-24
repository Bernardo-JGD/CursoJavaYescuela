
package Ejercicio9;


public abstract class Poligono {
    
    protected int numerodelados ;
    
    public Poligono (int numerodelados){
        this.numerodelados = numerodelados;
    }
    
    public int getNumerodelados (){
        return numerodelados;
    }
    public String mostrarDatos (){
        return "El numero de lados es: " + numerodelados;
    }
    public abstract double area ();
    
    //este metodo practicamente es el metodo de mostrar datos, lo que pasa es que se puede insertar este codigo
    //se utliza con override por que hereda de la clase object y todo en java hereda de la clase object 
    /*
    @Override
    public String toString() {
        return "Poligono{" + "numerodelados=" + numerodelados + '}';
    }
*/

    
    
    
}
