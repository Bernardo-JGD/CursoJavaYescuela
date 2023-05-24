
package Herencia_133_Abstraccion;



public class Principal {
    
    public static void main(String[] args) {
        //Yo no puedo crear metodos de las clases abstractas
        //      SerVivo vivo = new SerVivo();
        Planta planti = new Planta ();
        planti.alimentarse();
        AnimalCarnivoro ac= new AnimalCarnivoro ();
        ac.alimentarse();
        AnimalHervivoro ah = new AnimalHervivoro ();
        ah.alimentarse();
    }
    
}
