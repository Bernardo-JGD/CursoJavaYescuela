
package Herencia_133_Abstraccion;


public class Planta extends SerVivo{
    
    //aqui tengo que indicar con el "@Override" que estoy sobreescribiendo el metodo y ya puedo usarlo 
    @Override
    public void alimentarse (){
        System.out.println("La planta se alimenta a traves de la fotosintesis");
    }
    
}
