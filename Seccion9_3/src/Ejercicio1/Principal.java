package Ejercicio1;

import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        Cuadrilatero c;
        
        boolean estado = false;
        int salir;
        int op;

        //datos del cuadrado
        float lado1, lado2;
        float lado3, lado4;
        
        do {
            
            System.out.println("Ingrese el numero de la opcion que desee");
            System.out.println("1.Cuadrado  2.Rectangulo  3.Irregular (solo perimetro)");
            op = leer.nextInt();
            
            switch (op) {
                
                case 1:                    
                    System.out.println("Ingrese la longitud del lado");
                    lado1 = leer.nextFloat();
                    c = new Cuadrilatero(lado1);
                    System.out.println("El area es " + c.area(op));
                    System.out.println("El perimetro es: " + c.perimetro(op));
                    break;
                
                case 2:
                    System.out.println("Ingrese la longitud del lado 1");
                    lado1 = leer.nextFloat();
                    System.out.println("Ingrese la longitud del lado 2");
                    lado2 = leer.nextFloat();
                    c = new Cuadrilatero(lado1, lado2);
                    System.out.println("El area es " + c.area(op));
                    System.out.println("El perimetro es: " + c.perimetro(op));
                    break;
                
                case 3:
                    System.out.println("Ingrese la longitud del lado 1");
                    lado1 = leer.nextFloat();
                    System.out.println("Ingrese la longitud del lado 2");
                    lado2 = leer.nextFloat();
                    System.out.println("Ingrese la longitud del lado 3");
                    lado3 = leer.nextFloat();
                    System.out.println("Ingrese la longitud del lado 4");
                    lado4 = leer.nextFloat();
                    
                    c = new Cuadrilatero(lado1, lado2, lado3, lado4);
                    System.out.println("El perimetro es: " + c.perimetro(op));
                    
                    break;
                
                default:
                    System.out.println("Esa opcion no existe");
                    break;
                
            }
            
            System.out.println("Si desea salir presione-----1");
            System.out.println("Si desea regresar al menu presione cualquier otro numero");
            salir = leer.nextInt();
            if (salir == 1) {
                estado = true;
            }
        } while (estado == false);
        
    }
    
}
