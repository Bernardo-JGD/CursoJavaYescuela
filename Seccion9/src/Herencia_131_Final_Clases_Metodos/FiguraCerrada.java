
package Herencia_131_Final_Clases_Metodos;

//si yo coloco final asi: 
//  final public class FiguraCerrada extends Figura{
// la clase no podra heredar, o sea no podra tener hijos, me saldria error en cuadrado
 public class FiguraCerrada extends Figura{
    
    private int nLados;
    
    public FiguraCerrada (double tamaño, int nLados){
        super(tamaño);
        this.nLados = nLados;
    }
    //para crear un metodos final, ponemos la palabra "final" antes del tipo de retorno que va a tener
    // esto quiere decir que no puede existir ningun metodo con el mismo nombre en las subclases que salgan de esta
    public final void dibujar (){
        System.out.println("figurando una dibuja :V");
    }
    
}
