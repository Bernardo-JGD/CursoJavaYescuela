package DatosPrimitivos;

import java.util.Scanner;

public class Datos {

    public static void main(String[] args) {

        System.out.println("NUMEROS ENTEROS");

        System.out.println("byte");
        byte limite_inferior = -128, limite_superior = 127;
        System.out.println("Limite inferior: " + limite_inferior);
        System.out.println("Limite superior: " + limite_superior + "\n");

        //------------------------------------------
        System.out.println("short");
        short limite_inferior2 = -32768, limite_superior2 = 32767;
        System.out.println("Limite inferor: " + limite_inferior2);
        System.out.println("Limite superior: " + limite_superior2 + "\n");

        //------------------------------------------
        System.out.println("int");
        int limite_inferior3 = -2147483648, limite_superior3 = 2147483647;
        System.out.println("Limite inferor: " + limite_inferior3);
        System.out.println("Limite superior: " + limite_superior3 + "\n");

        //------------------------------------------
        System.out.println("long");
        long limite_inferior4 = -9223372036854775808L, limite_superior4 = 9223372036854775807L;
        System.out.println("Limite inferor: " + limite_inferior4);
        System.out.println("Limite superior: " + limite_superior4 + "\n");

        //------------------------------------------
        System.out.println("NUMEROS CON DECIMALES ");

        System.out.println("float");
        float f1 = -3.14f, f2 = -3.14f;
        System.out.println("Valor 1: " + f1);
        System.out.println("valor 2: " + f2 + "\n");

        System.out.println("double");
        double d1 = -123.0000000001, d2 = 123321.123231123321;
        System.out.println("Valor 1: " + f1);
        System.out.println("Valor 2: " + f2 + "\n");

        //------------------------------------------
        System.out.println("Char ");
        char a = 'a';
        System.out.println("a: " + a + "\n");

        //------------------------------------------
        System.out.println("boolean ");
        boolean decision_cierta = true;
        boolean decision_falsa = false;
        System.out.println("Verdad: " + decision_cierta);
        System.out.println("Mentira: " + decision_falsa + "\n");

        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------
        System.out.println("Datos no primitivos" + "\n");
        System.out.println("Integer");
        Integer numero = null;
        System.out.println("numero Integer: " + numero);
        numero = 1;
        System.out.println("numero Integer: " + numero + "\n");

        //------------------------------------------
        System.out.println("String");
        String palabras = "que hongo?";
        System.out.println("Palabra: " + palabras + "\n");

        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------
        System.out.println("Constantes" + "\n");

        System.out.println("final");
        final int num1 = 10;
        final double pi = -3.1416;
        final String nom = "nom";
        System.out.println("int: " + num1);
        System.out.println("double: " + pi);
        System.out.println("String: " + nom);

        //--------------------------
        //ENTRADA DE DATOS 
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        
        
        int numero_usuario;
        System.out.println("Ingrese su numero entero");
        numero_usuario = leer.nextInt();
        System.out.println("su numero es: " + numero_usuario);
        float numerodecimal;
        System.out.println("Ingrese un numero con decimal");
        numerodecimal = leer.nextFloat();
        System.out.println("Su numero es: " + numerodecimal + "\n");
        //si no acepta punto, se puede poner ","
        
        
        System.out.println("Cadena");
        System.out.println("una palabra ");
        String cadena1;
        System.out.println("Ingrese una palabra");
        cadena1 = leer.next();
        System.out.println("mas de una palabra" + "\n");
        String cadena2;
        System.out.println("Ingrese una frase ");
        cadena2 = leer1.nextLine();
        System.out.println("ingrese un numero");
        int num;
        num = leer.nextInt();
        System.out.println("Ingrese otra frase");
        String cadena3;
        cadena3 = leer1.nextLine();
        System.out.println("La palabra: " + cadena1);
        System.out.println("La frase: " + cadena2);
        System.out.println("el numero: " + num);
        System.out.println("La otra frase: " + cadena3);
        
        System.out.println("");
        System.out.println("un solo caracter");
        System.out.println("Ingrese un caracter");
        char var;
        var = leer.next().charAt(0);
        System.out.println("el caracter que mostro es: " + var);
        
        /*
        si quiero leer una frase completa, tengo que crear otro objeto de tipo Scanner para que no haya error con los
        datos de tipo numerico 
        */
        

    }

}
