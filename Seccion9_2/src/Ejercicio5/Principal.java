package Ejercicio5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double base, lado;
        int n_triangulos;
        
        System.out.println("Ingrese la cantidad de triangulos");
        n_triangulos = leer.nextInt();
        
        Triangulo_Isoceles ti[] = new Triangulo_Isoceles [n_triangulos];
        
        for (int i = 0; i < ti.length; i++) {
            System.out.println("Ingrese los valores del triangulo " + (i+1)  );
            System.out.println("Ingrese la base");
            base = leer.nextDouble ();
            System.out.println("Ingrese el lado");
            lado = leer.nextDouble ();
            
            ti[i] = new Triangulo_Isoceles (base, lado);
            System.out.println("El perimetro del triangulo es: " + ti[i].obtener_perimetro());
            System.out.println("El area del triangulo es: " + ti[i].obtener_area());
        }   
        System.out.println("El area del triangulo de mayor area es: " + mayor_area(ti));
        
        
    }
    public static double mayor_area (Triangulo_Isoceles ti[]){
        
        double area;
        
        area = ti[0].obtener_area();
        for (int i = 0; i < ti.length; i++) {
            if (ti[i].obtener_area()> area) {
                area = ti[i].obtener_area();
            }
        }
        return area;
    }

}
