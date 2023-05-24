
package Ejercicio5;

    //-----------------------------------Diseñar un programa para trabajar con triangulos isoceles.
    //-----------------------------------Para ello defina los atributos necesarios que se requieren, 
    //-----------------------------------proporcione metodos de consulta, un metodo constructor e implemente
    //-----------------------------------metodos para calculas el perimetro y el area de un triangulo, 
    //-----------------------------------ademas implementear un metodo que a partir de un arreglo
    //----------------------------------- de triangulos deuelva el area del triangulo de mayor superficie 
    
public class Triangulo_I {
    
    private double lado;
    private double base;
    private double perimetro;
    private double area;
    
    public Triangulo_I (double lado, double base, double perimetro, double area){
        this.lado = lado;
        this.base = base;
        this.perimetro = perimetro;
        this.area = area;
    }
    public String  mostrar (){
        
        return "Lado: " + lado + "\nBase: " + base + "\nPerimetro: " + perimetro + "\nArea: " + area + "\n";
        
    }
    public double getArea (){
        return area;
    }
    
    
}
