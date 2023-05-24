
package Pruebas_codigo;


public class Probando {
    
    public static void main(String[] args) {
        String p;
        double numero = 5497;
        numero = Math.pow(numero, 2);
        int entero = (int) numero;
        System.out.println(entero);
        char ar[] = String.valueOf(entero).toCharArray();
       
        System.out.println(ar.length);
        System.out.println((ar.length)/2);
        System.out.println("");
        System.out.print(ar[(ar.length/2)-2]);
        System.out.print(ar[(ar.length/2)-1]);
        System.out.print(ar[(ar.length/2)]);
        System.out.print(ar[(ar.length/2)+1]);
        

        double numero2 = 2170;
        numero2 = Math.pow(numero2, 2);
        int entero2 = (int) numero2;
        System.out.println(entero2);
        char ar2[] = String.valueOf(entero2).toCharArray();
        System.out.println(ar2.length);
        System.out.println(ar2.length/2);
        
        System.out.println(ar2[(ar2.length/2)-2]);
        System.out.print(ar2[(ar2.length/2)-1]);
        System.out.print(ar2[(ar2.length/2)]);
        System.out.print(ar2[(ar2.length/2)+1]);
        
        
        
       /* char ar[] = String.valueOf(numero).toCharArray();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
       */
        
    }
    
}
