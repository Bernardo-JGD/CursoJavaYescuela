
package ICPC;

import java.util.Scanner;

public class G_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int C;
        C = leer.nextInt();
        int suma = 100;
        int contar_negativos = 0;
        int ultimo_positivo = 0;
            int arreglo[] = new int[C];

            for (int i = 0; i < C; i++) {
               
                    arreglo[i] = leer.nextInt();
                
                if (arreglo[i] < 0) {
                    contar_negativos++;
                } else {
                    ultimo_positivo = i;
                }
            }
            if (contar_negativos == C) {
                System.out.println(suma);
            } else {
                for (int i = 0; i <= ultimo_positivo; i++) {

                    suma = suma + arreglo[i];
                }
                System.out.println(suma);
            }
        

    }

}
