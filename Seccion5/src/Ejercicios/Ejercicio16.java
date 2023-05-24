package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //---------------------------
        //------------------------------------COMO YO LE ENTENDI 
        //---------------------------
        System.out.println("Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un centro educativo.");
        System.out.println("Cada grupo o clase está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo");
        System.out.println("y tercer trimestre de un grupo. Debemos mostrar al final la nota media del grupo en cada trimestre");
        System.out.println("y la media del alumno que se encuentra en la posicion N (N se lee por teclado)");

        float alumno1[] = new float[3];
        float alumno2[] = new float[3];
        float alumno3[] = new float[3];
        float alumno4[] = new float[3];
        float alumno5[] = new float[3];

        float suma_t1 = 0, suma_t2 = 0, suma_t3 = 0;

        float promedio1 = 0, promedio2 = 0, promedio3 = 0;
        
        float promedio_a1 = 0, promedio_a2 = 0, promedio_a3 = 0, promedio_a4 = 0, promedio_a5 = 0; 
        float suma_a1 = 0, suma_a2 = 0, suma_a3 = 0, suma_a4 = 0, suma_a5 = 0;
        
        int n_alumno;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i);
            for (int j = 1; j <= 3; j++) {

                if (i == 1) {
                    System.out.println("Ingrese la calificicacion del trimestre " + j);
                    alumno1[j - 1] = leer.nextFloat();
                    if (j == 1) {
                        suma_t1 = suma_t1 + alumno1[j - 1];
                    }
                    if (j == 2) {
                        suma_t2 = suma_t2 + alumno1[j - 1];
                    }
                    if (j == 3) {
                        suma_t3 = suma_t3 + alumno1[j - 1];
                    }
                }
                if (i == 2) {
                    System.out.println("Ingrese la calificicacion del trimestre " + j);
                    alumno2[j - 1] = leer.nextFloat();
                    if (j == 1) {
                        suma_t1 = suma_t1 + alumno2[j - 1];
                    }
                    if (j == 2) {
                        suma_t2 = suma_t2 + alumno2[j - 1];
                    }
                    if (j == 3) {
                        suma_t3 = suma_t3 + alumno2[j - 1];
                    }
                }
                if (i == 3) {
                    System.out.println("Ingrese la calificicacion del trimestre " + j);
                    alumno3[j - 1] = leer.nextFloat();
                    if (j == 1) {
                        suma_t1 = suma_t1 + alumno3[j - 1];
                    }
                    if (j == 2) {
                        suma_t2 = suma_t2 + alumno3[j - 1];
                    }
                    if (j == 3) {
                        suma_t3 = suma_t3 + alumno3[j - 1];
                    }
                }
                if (i == 4) {
                    System.out.println("Ingrese la calificicacion del trimestre " + j);
                    alumno4[j - 1] = leer.nextFloat();

                    if (j == 1) {
                        suma_t1 = suma_t1 + alumno4[j - 1];
                    }
                    if (j == 2) {
                        suma_t2 = suma_t2 + alumno4[j - 1];
                    }
                    if (j == 3) {
                        suma_t3 = suma_t3 + alumno4[j - 1];
                    }

                }
                if (i == 5) {
                    System.out.println("Ingrese la calificicacion del trimestre " + j);
                    alumno5[j - 1] = leer.nextFloat();

                    if (j == 1) {
                        suma_t1 = suma_t1 + alumno5[j - 1];
                    }
                    if (j == 2) {
                        suma_t2 = suma_t2 + alumno5[j - 1];
                    }
                    if (j == 3) {
                        suma_t3 = suma_t3 + alumno5[j - 1];
                    }

                }

            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i);
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    System.out.print("-" + alumno1[j]);
                }
                if (i == 2) {
                    System.out.print("-" + alumno2[j]);
                }
                if (i == 3) {
                    System.out.print("-" + alumno3[j]);
                }
                if (i == 4) {
                    System.out.print("-" + alumno4[j]);
                }
                if (i == 5) {
                    System.out.print("-" + alumno5[j]);
                }

            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (i == 0) {
                    suma_a1 = suma_a1 + alumno1[j];
                }
                if (i == 1) {
                    suma_a2 = suma_a2 + alumno2[j];
                }
                if (i == 2) {
                    suma_a3 = suma_a3 + alumno3[j];
                }
                if (i == 3) {
                    suma_a4 = suma_a4 + alumno4[j];
                }
                if (i == 4) {
                    suma_a5 = suma_a5 + alumno5[j];
                }
                
            }
        }
        promedio_a1 = suma_a1/ 3;
        promedio_a2 = suma_a2/ 3;
        promedio_a3 = suma_a3/ 3;
        promedio_a4 = suma_a4/ 3;
        promedio_a5 = suma_a5/ 3;
        

        promedio1 = suma_t1 / 5;
        promedio2 = suma_t2 / 5;
        promedio3 = suma_t3 / 5;
        System.out.println("Promedio por grupo");
        System.out.println("Promedio del grupo trimestre 1 " + promedio1);
        System.out.println("Promedio del grupo trimestre 2 " + promedio2);
        System.out.println("Promedio del grupo trimestre 3 " + promedio3);
        
        System.out.println("Ingrese el numero del alumno del cual desea saber el promedio");
        n_alumno = leer.nextInt();
        
        switch (n_alumno){
            
            case 1 :
                System.out.println("Promedio del alumno " + n_alumno + " " + promedio_a1);
                break;
                
            case 2 :
                System.out.println("Promedio del alumno " + n_alumno + " " + promedio_a2);
                break;
                
            case 3 :
                System.out.println("Promedio del alumno " + n_alumno + " " + promedio_a3);
                break;
                
            case 4 :
                System.out.println("Promedio del alumno " + n_alumno + " " + promedio_a4);
                break;
                
            case 5 :
                System.out.println("Promedio del alumno " + n_alumno + " " + promedio_a5);
                break;
                
            default :
                System.out.println("Ese alumno no existe :v ");
                break;
            
        }

    }

}
