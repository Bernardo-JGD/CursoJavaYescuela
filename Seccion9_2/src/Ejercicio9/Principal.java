package Ejercicio9;

import java.util.Scanner;
import java.util.ArrayList;

/*
                            Hacer un programa para calcular el area de poligonos, (Triangulos y rectangulos) el programa  
                            debe ser capaz de almacenar un arreglo de N triangulos y rectangulos y al final mostrar el area
                            y los datos de cada uno. Para ello se tendra lo siguiente

                            -Una superclase llamada Poligono
                            -Una sub-clase llamada Rectangulo
                            -Una sub-clase llamada Triangulo
 */
public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    static Scanner leer = new Scanner(System.in);

    public static void main(String args[]) {
        
        
        llenarPoligono ();
        mostrarResultados ();
        
    }

    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("1.Triangulo    2.Rectangulo");
                System.out.println("Digite el numero del poligono que desea");
                opcion = leer.nextInt();

            } while (opcion < 1 || opcion > 2);
            
            switch (opcion) {
                case 1 :
                    //Llenar Triangulo
                    llenarTriangulo();
                    break;
                    
                case 2 :
                    //Llenar Rectangulo
                    llenarRectangulo();
                    break;
                    
                default : 
                    System.out.println("Eso no existe :v");
                    break;
            }
            System.out.println("¿Desea ingresar otro poligono? (s/n)");
            respuesta = leer.next().charAt(0);
            
        } while (respuesta == 's' || respuesta == 'S');
    }
    public static void llenarTriangulo (){
        double lado1, lado2, lado3;
        System.out.println("Ingrese el valor del lado 1");
        lado1 = leer.nextDouble ();
        System.out.println("Ingrese el valor del lado 2");
        lado2 = leer.nextDouble ();
        System.out.println("Ingrese el valor del lado 3");
        lado3 = leer.nextDouble ();
        
        Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
        //guardamos un triangulo dentro de nuestro arreglo de poligonos 
        poligono.add(triangulo);      
    }
    public static void llenarRectangulo (){
        double lado1, lado2;
        System.out.println("Ingrese el valor del lado 1");
        lado1 = leer.nextDouble ();
        System.out.println("Ingrese el valor del lado 2");
        lado2 = leer.nextDouble ();
        Rectangulo rectangulo = new Rectangulo (lado1, lado2);
        
        poligono.add(rectangulo);
    }
    public static void mostrarResultados (){
        for (Poligono poli: poligono) {
            System.out.println(poli.mostrarDatos());
            System.out.println("Area: " + poli.area());
            System.out.println("");
        }
    }
}
