
package RE2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherApp {
    
    public static void main(String[] args) {
        
        String texto = "Suscribete al canal de MitoCode suscribete suscribete";
        Pattern p = Pattern.compile("suscribete", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(texto);
        
        System.out.println("matches " + m.matches());
        System.out.println("lookingAt " + m.lookingAt());
        
        int contador = 0;
        while(m.find()){
            contador++;
            System.out.println("Coincidencia: " + contador + " start " + m.start() + " end " + m.end());
        }
        
    }
    
}
