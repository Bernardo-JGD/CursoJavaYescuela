
import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int C;
        C = leer.nextInt();
        int vuelta = 0, cont_n = 0, ult_p = -1, suma = 100;
        int ar[] = new int[C];
        for (int i = 0; i < C; i++) {

            ar[i] = leer.nextInt();
            if (ar[i] < 0) {
                cont_n++;
            } else {
                ult_p = i;

            }
            if (i == C-1) {
                if (ult_p == -1) {
                    System.out.println(suma);
                }else{
                    for (int j = 0; j <=ult_p; j++) {
                        suma = suma + ar[j];
                        if (j == ult_p) {
                            System.out.println(suma);
                        }
                    }
                }
            }

        }
        //System.out.println(suma);

    }

}
