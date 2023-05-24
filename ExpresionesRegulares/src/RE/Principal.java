
package RE;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Principal {
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String a_evaluar = "Hola mundo!! estoy en Mexico!!";
        String regex;//variable que guarda la expresion regular
        while (true){
            regex = leer.next();//introduzco por teclado la expresion regular
            if (regex.equals("exit")) {
                break;
            }
            Pattern patron = Pattern.compile(regex);//Epresion regular
            Matcher m = patron.matcher(a_evaluar);
            
            boolean coincidencia = m.find();
            System.out.println("Hay alguna coincidencia? " + coincidencia );
        }
        
    }
    
}
