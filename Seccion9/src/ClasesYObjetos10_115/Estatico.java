
package ClasesYObjetos10_115;

import java.util.Scanner;
public class Estatico {
    Scanner leer = new Scanner (System.in);
    //los miembros estaticos se conocen como miembros de clase
    //ya no le pertenecen al objeto le pertenecen a la clase 
    //como este ya es un atributo estatico ya no le pertenece a los objetos, le pertenece a la clase
    private static String frase = "Primera frase";
    /*
    los atributos estaticos ya no necesitan instanciar objetos para poder ser utilizados
    un atributo estatico como le pertenece a la clase puede ser llamado usando: nombre_clase.nombre_atributi
    */
    private static String masita = "Mi masita es: ";
    private static double masita1 = 83.5;
    
    public static void main(String[] args) {
        
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        
        System.out.println(Estatico.masita + " " + Estatico.masita1);
        System.out.println("La suma es: " + Estatico.suma(0, 0));
        
        //------------------------
        ob1.mostrar(); 
        ob2.mostrar();
        
        
    }
    
    /*
    de igual manera al crear metodos estaticos
    estos solo le pertencen a la clase
    */
    public static int suma (int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    //--------------------------------------------------------
    public void mostrar (){
        
        System.out.println("Ingrese numero1");
        int n1 = leer.nextInt();
        System.out.println("Ingrese numero2");
        int n2 = leer.nextInt();
        System.out.println("La suma es: " + suma(n1, n2));
        
    }
    
    
}
