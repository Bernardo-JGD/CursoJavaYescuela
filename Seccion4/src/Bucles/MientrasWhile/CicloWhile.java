package Bucles.MientrasWhile;



import java.util.Scanner;
public class CicloWhile {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);

        int iterador1 = 1, iterador2 = 10, numero = 1, inum=1, inum2 = 1;

        System.out.println("Forma ascendente");
        while (iterador1 <= 10) {

            System.out.println(iterador1);
            iterador1++;
        }
        System.out.println("Forma descendente");
        while (iterador2>=1){
            System.out.println(iterador2);
            iterador2--;
        }
        
        System.out.println("Ingrese la cantidad de numero que quiere");
        numero = leer.nextInt();
        
        while (inum<=numero){
            
            System.out.println(inum);
            inum++;
        }
        
        while (inum2<=31){
            
            System.out.println(inum2);
            inum2+=2;// el incremente puede ser el que yo quiera 
            
        }
        

    }

}
