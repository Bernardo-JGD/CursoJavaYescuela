
package Ejercicio6;

//---------------------------Construir un programa para trabajar con dos numero complejos, implemente los sigueinte
//---------------------------1.Sumar dos numeros complejos
//---------------------------2.Multiplicar dos numeros complejos 
//---------------------------3.Comparar dos numeros complejos (iguales o no)
//---------------------------4.Multiplicar un numero complejo por un entero

public class NumeroComplejo {
    //ejemplo 3+4i
    private double a;//parte real
    private double b;//parte imaginaria
    
    public NumeroComplejo (double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getA (){
        return a;
    }
    public double getB (){
        return b;
    }
    
    /*
        numero1 = 3+4i
        numero2 = 2+5i
        
        NumeroComplejo numero1 = new NumeroComplejo (3, 4);
        numero1.calcularSuma(numero2);
    */
    
    public NumeroComplejo calcularSuma (NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo (a+c.getA(), b+c.getB());
        
        return suma;
    }
    /*
            numero1 = 3+2i
            numero2 = 3+5i
            
            mult = ((3*2)-(4*5))+ ((3*5)+(4*2))
    */
    public NumeroComplejo calcularProducto (NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo ( ( ( a * c.getA() )- ( b * c.getB() ) ),  ( ( a * c.getB() ) + ( b * c.getA() ) ) );
        
        return mult;
    }
    
    /*
          numer01 = 3 + 4i
          numero2 = 3 + 4i
    */
    public boolean comprobarIgualdad (NumeroComplejo c){
        boolean igualdad = false;
        if ((a == c.getA()) && (b == c.getB())) {
            igualdad = true;
        }
        return igualdad;
    }
    /*
        numeroComplejo = 3+4i
    
        entero = 2
    
        mult = 6+8i
    */
    public NumeroComplejo multiplicacionPorEntero (int x){
        NumeroComplejo mult = new NumeroComplejo (a*x, b*x);
        return mult;
    }
    
    
}
