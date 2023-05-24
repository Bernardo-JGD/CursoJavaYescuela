
package RE1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternApp {
    
    public static void main(String[] args) {
        
        long ini = System.currentTimeMillis();
        
        Pattern p = Pattern.compile(";");
        //Matcher m = p.matcher("XYZ");
        //System.out.println(m.matches());
        for (int i = 0; i < 10000; i++) {
            String []arreglo = p.split("Jaime;MitoCode;Code;Mito");
        }
        
        long fin = System.currentTimeMillis();
        
        System.out.println(fin - ini);
        
        //////////////////////////////////////////////////////////////
        long iniSplit = System.currentTimeMillis();
        
        
        //Matcher m = p.matcher("XYZ");
        //System.out.println(m.matches());
        for (int i = 0; i < 10000; i++) {
            String []arreglo = "Jaime;MitoCode;Code;Mito".split(";");
        }
        
        long finSplit = System.currentTimeMillis();
        
        System.out.println(finSplit - iniSplit);
    }
    
}
