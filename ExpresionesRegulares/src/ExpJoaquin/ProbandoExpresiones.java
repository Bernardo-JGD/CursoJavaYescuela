
package ExpJoaquin;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ProbandoExpresiones {
    
    public static void main(String[] args) {
        
        String a_evaluar = "\n" +
"public class MultiplicacionMatrices {\n" +
"    //Multiplicación de matrices, logrado :3 \n" +
"    int n = 3;\n" +
"    int matriz1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};\n" +
"    int matriz2[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};\n" +
"    int matriz_resultante[][] = new int [3][3];\n" +
"    \n" +
"    public static void main(String[] args) {\n" +
"        \n" +
"        MultiplicacionMatrices mm = new MultiplicacionMatrices ();\n" +
"        \n" +
"        mm.mostrarMatricesRellenas();\n" +
"        System.out.println(\"\");\n" +
"        mm.multi();\n" +
"        System.out.println(\"\");\n" +
"        mm.mostrarMR();\n" +
"        \n" +
"    }\n" +
"    \n" +
"    public void multi (){\n" +
"        int suma = 0;\n" +
"        \n" +
"        for (int i = 0; i < 3; i++) {\n" +
"            for (int j = 0; j < 3; j++) {\n" +
"                for (int k = 0; k < 3; k++) {\n" +
"                    \n" +
"                    suma = suma + (matriz1[i][k] * matriz2[k][j]);\n" +
"                    System.out.println(\"i = \" + i + \"\\nj = \" + j + \"\\nk = \" + k);\n" +
"                    System.out.println(\"\");\n" +
"\n" +
"                    if (k == 2) {\n" +
"                        matriz_resultante[i][j] = suma;\n" +
"                        System.out.println(\"suma = \" + matriz_resultante[i][j]);\n" +
"                        System.out.println(\"\");\n" +
"                        suma = 0;\n" +
"                    }\n" +
"                    \n" +
"                     \n" +
"                    \n" +
"                }   \n" +
"            }\n" +
"        }\n" +
"        \n" +
"    }\n" +
"    \n" +
"    public void mostrarMatricesRellenas (){\n" +
"        \n" +
"        for (int i = 0; i < 3; i++) {\n" +
"            for (int j = 0; j < 3; j++) {\n" +
"                System.out.print(\"[\" + matriz1[i][j] + \"]\");\n" +
"            }\n" +
"            System.out.println(\"\");\n" +
"        }\n" +
"        System.out.println(\"\");\n" +
"        for (int i = 0; i < 3; i++) {\n" +
"            for (int j = 0; j < 3; j++) {\n" +
"                System.out.print(\"[\" + matriz2[i][j] + \"]\");\n" +
"            }\n" +
"            System.out.println(\"\");\n" +
"        }\n" +
"        \n" +
"    }\n" +
"    \n" +
"    public void mostrarMR(){\n" +
"        \n" +
"        for (int i = 0; i < 3; i++) {\n" +
"            for (int j = 0; j < 3; j++) {\n" +
"                System.out.print(\"[\" + matriz_resultante[i][j] + \"]\");\n" +
"                \n" +
"            }\n" +
"            System.out.println(\"\");\n" +
"        }\n" +
"        \n" +
"    }\n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"}\n" +
"";
        
        String expresion = "\\d*\\.?\\d+";
        
        Pattern patron = Pattern.compile(expresion);
        Matcher m = patron.matcher(a_evaluar);
        boolean coincidencia = m.find();
        
        System.out.println("Coincidencia: " + coincidencia);
        
        System.out.println("Encontró: " + m);
        
    }
    
}
