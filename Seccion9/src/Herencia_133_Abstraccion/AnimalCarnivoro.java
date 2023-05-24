
package Herencia_133_Abstraccion;


public class AnimalCarnivoro extends Animal{
    
    //para quitar el error al momento de heredar de una clase abstracta, tengo que indicar con el "@Override" la
    //sobreescritura del metodo 
    @Override
    public void alimentarse (){
        System.out.println("Soy un animal carnivoro, roar, como carne, roar");
    }
    
}
