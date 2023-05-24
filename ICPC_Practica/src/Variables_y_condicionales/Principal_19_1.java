
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_19_1 {
    //19. Pedir dos fechas y mostrar el número de días que hay de diferencia. 
    //aqui supondre que no hay años visiestos y  si hay meses de 31 y 30 y febrero de 28
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int dia_1, mes_1, year_1, dia_2, mes_2, year_2;
        int conta_mes = 0, mes=0;
        int dias_f_1 = 0, dias_f_2 = 0, distancia;
        
        System.out.println("Fecha 1");
        System.out.println("Ingrese el dia");
        dia_1 = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes_1 = leer.nextInt();
        System.out.println("Ingrese el año");
        year_1 = leer.nextInt();
        
        System.out.println("Fecha 2");
        System.out.println("Ingrese el dia");
        dia_2 = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes_2 = leer.nextInt();
        System.out.println("Ingrese el año");
        year_2 = leer.nextInt();
        //enero-31, febrero-28, marzo-31, abril-30, mayo-31, junio-30, julio-31, agosto-31
        //septiembre-30, octubre-31, noviembre-30, diciembre-31
        //31-----------1--3--5--7--8--10--12
        //30--4--6--9--11
        do{
            if (conta_mes == 0) {
                mes = mes_1;
            }else{
                if (conta_mes == 1) {
                    mes = mes_2;
                }
            }
        switch (mes){
            
            case 1 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (year_1*365);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (year_1*365);
                    }
                }
                
                break;
                
            case 2 : 
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (31) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (31) + (365*year_2);
                    }
                }
                
                break;
                
            case 3 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (59) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (59) + (365*year_2);
                    }
                }
                
                break;
                
            case 4 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (90) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (90) + (365*year_2);
                    }
                }
                
                break;
                
            case 5 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (120) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (120) + (365*year_2);
                    }
                }
                
                break;
                
            case 6 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (151) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (151) + (365*year_2);
                    }
                }
                
                break;
                
            case 7 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (181) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (181) + (365*year_2);
                    }
                }
                
                break;
                
            case 8 : 
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (212) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (212) + (365*year_2);
                    }
                }
                
                break;
                
            case 9 : 
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (243) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (243) + (365*year_2);
                    }
                }
                
                break;
                
            case 10 : 
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (273) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (273) + (365*year_2);
                    }
                }
                
                break;
            
            case 11 : 
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (304) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (304) + (365*year_2);
                    }
                }
                
                break;
                
            case 12 :
                
                if (conta_mes == 0) {
                    dias_f_1 = dia_1 + (334) + (365*year_1);
                }else{
                    if (conta_mes == 1) {
                        dias_f_2 = dia_2 + (334) + (365*year_2);
                    }
                }
                
                break;
        }
        conta_mes++;
        
        }while (conta_mes<2);
        System.out.println(dias_f_1 + "----" + dias_f_2);
        
        distancia = dias_f_2 - dias_f_1;
        System.out.println("La distancia en dias entre las fechas es:  ");
        System.out.println(distancia);
        
    }
    
}
