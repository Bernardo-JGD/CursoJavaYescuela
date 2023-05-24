
package Interfaces_145_Simulacion_Herencia_Multiple;

public class MusicoEstudiante implements Musico, Estudiante{
    
    @Override
    public void hablar (){
        System.out.println("Estoy hablando español");
    }
    @Override 
    public void tocarmusica (){
        System.out.println("Estoy tocando la guitarra");
    }
    @Override
    public void estudiar (){
        System.out.println("Estoy estudiando programacion");
    }
    
}
