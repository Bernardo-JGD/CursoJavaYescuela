
package Herencia_132_SobreEscritura;


public class Principal {
    
    public static void main(String[] args) {
        
        Persona p = new Persona ();
        Perro pe = new Perro ();
        Vaca v = new Vaca ();
        
        p.comer();
        //si yo elimino el metodo sobre escrito de la clase perro, y mando a llamar el metodo comer, llama al metodo orignal
        //de la clase padre, o sea, el metodo comer dentro de la clase Animal
        pe.comer();
        v.comer();
        
    }
    
}
