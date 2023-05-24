
package ClasesYObjetos6_111;


public class Persona {
    
    String nombre;
    int edad;
    String dni;
    /*{
    se pueden crear varios metodos contructores , y a eso se le llama sobrecarga de constructores 
    se diferencian por los parametros que reciben, no deben ser los mismos
    */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    // tambien puede haber una sobrecarga de metodos
    /*
    pueden tener el mismo nombre
    se diferencian por la cantiad y tipo de parametros que reciben o el tipo de dato que reciben
    */
    
    public void correr (){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años " + " y estoy corriendo un maraton");
    }
    public void correr (int km){
        System.out.println("He corriedo " + km + " kilometros") ;
    }
    
}
