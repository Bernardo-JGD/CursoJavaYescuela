
package Herencia_131_Final_Clases_Metodos;


public class Cuadrado extends FiguraCerrada{
    
    private double area;
    
    public Cuadrado (double tamaño, int nLados, double area){
        super(tamaño, nLados);
        this.area = area;
    }
    // si quiero usar este metodo cambio el nombre: 
    //      nombre original dibujar
    //      nombre actual dibujar1
    public void dibujar1 (){
        System.out.println("Dibujamos un cuadrado");
    }
    
}
