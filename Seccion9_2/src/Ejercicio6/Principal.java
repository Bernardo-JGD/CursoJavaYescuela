package Ejercicio6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*
            numero1 = a+bi      
            numero2 = c+di
         */
        NumeroComplejo numero1, numero2, suma, mult;
        double a, b, c, d;
        int opcion, entero;

        do {
            System.out.println("Operaciones con numeros complejos");
            System.out.println("1.Sumar dos numeros complejos");
            System.out.println("2.Multiplicar dos numeros complejos ");
            System.out.println("3.Comparar dos numeros complejos (iguales o no)");
            System.out.println("4.Multiplicar un numero complejo por un entero");
            System.out.println("5.Salir");
            System.out.println("Digite la opcion que desea");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el primer numero complejo");
                    System.out.println("Digite la parte real");
                    a = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    b = leer.nextDouble();
                    System.out.println("Ingrese el segundo numero complejo");
                    System.out.println("Digite la parte real");
                    c = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    d = leer.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es: " + suma.getA() + " + " + suma.getB() + "i");

                    break;

                case 2:
                    System.out.println("Ingrese el primer numero complejo");
                    System.out.println("Digite la parte real");
                    a = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    b = leer.nextDouble();
                    System.out.println("Ingrese el segundo numero complejo");
                    System.out.println("Digite la parte real");
                    c = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    d = leer.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    mult = numero1.calcularProducto(numero2);

                    System.out.println("La multiplicacion es: " + mult.getA() + " + " + mult.getB() + "i");

                    break;

                case 3:
                    System.out.println("Ingrese el primer numero complejo");
                    System.out.println("Digite la parte real");
                    a = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    b = leer.nextDouble();
                    System.out.println("Ingrese el segundo numero complejo");
                    System.out.println("Digite la parte real");
                    c = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    d = leer.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    if (numero1.comprobarIgualdad(numero2)) {
                        System.out.println("Los numeros complejos son iguales");
                    }else{
                        System.out.println("Los numeros complejos no son iguales");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el primer numero complejo");
                    System.out.println("Digite la parte real");
                    a = leer.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    b = leer.nextDouble();
                    System.out.println("Digite un numero entero");
                    entero = leer.nextInt();
                    
                    numero1 = new NumeroComplejo(a, b);
                    
                    mult = numero1.multiplicacionPorEntero(entero);
                    System.out.println("La multiplicacion es: " + mult.getA() + " + " + mult.getB() + "i");
                    
                    break;

                case 5:
                    break;

                default:
                    System.out.println("No existe esa opcion");
                    break;

            }

        } while (opcion != 5);

    }

}
