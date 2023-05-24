
package Herencia_132_SobreEscritura;

public class Persona extends Animal{
    
    //la anotacion @Override quiere decir que estamos sobreescribiendo un metodo, en este caso el metodo comer
    // al momento de crear un objeto de la clase persona, y llamamos el metodo comer
    // ya no llamamos al metodo de la clase animal, llamamos al metodos de esta misma clase, comer de clase persona
    @Override
    public void comer (){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
