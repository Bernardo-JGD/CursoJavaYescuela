
package Ejercicio5;

    //-----------------------------------Diseñar un programa para trabajar con triangulos isoceles.
    //-----------------------------------Para ello defina los atributos necesarios que se requieren, 
    //-----------------------------------proporcione metodos de consulta, un metodo constructor e implemente
    //-----------------------------------metodos para calculas el premetro y el area de un triangulo, ademas im´plementear un
    //-----------------------------------metodos que a partir de un arreglo de triangulos deuelva el area del triangulo
    //-----------------------------------de mayor superficie 
    
public class Triangulo_Isoceles {
    
    private double base;
    private double lado;
    
    public Triangulo_Isoceles (double base, double lado){
        this.base = base;
        this.lado = lado;
    }
    public double obtener_perimetro (){
        
        double perimetro = (2*lado) + base;
        return perimetro;
    }
    public double obtener_area (){
        double area = (base*Math.sqrt(lado*lado-((base*base)/4))) /2;
        return area;
    }
    
    
}
