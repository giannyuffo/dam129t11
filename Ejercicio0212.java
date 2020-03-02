
package ejercicios;
import java.util.Scanner;
public class Ejercicio0212 {
public static void main(String[] args){
       
        Scanner teclado = new Scanner(System.in);
        int day, month,year;
        
        System.out.println("Introduce el mes");
        month = teclado.nextInt();
        System.out.println("Introduce el día");
        day = teclado.nextInt();
        System.out.println("Introduce el año");
        year = teclado.nextInt();
        
        if ((month == 1 || month ==3 || month == 5|| month ==7 || month ==8 || month ==10 || month ==12) && day > 0 && day < 32)
            {
                switch(month){
                    case 1: System.out.println("La fecha es : " + day + " de Enero de " + year);break;
                    case 3: System.out.println("La fecha es : " + day + " de Marzo de " + year);break;
                    case 5: System.out.println("La fecha es : " + day + " de Mayo de " + year);break;
                    case 7: System.out.println("La fecha es : " + day + " de Julio de " + year);break;
                    case 8: System.out.println("La fecha es : " + day + " de Agosto de " + year);break;
                    case 10: System.out.println("La fecha es : " + day + " de Octubre de " + year);break;
                    case 12: System.out.println("La fecha es : " + day + " de Diciembre de " + year);break;
                }               
                
            }
        else {
                    if ((month == 4 || month ==6 || month == 9|| month ==11 ) && day > 0 && day < 31)
                    {
                    switch(month){
                     case 4: System.out.println("La fecha es : " + day + " de Abril de " + year);break;
                     case 6:System.out.println("La fecha es : " + day + " de Junio de " + year);break;
                     case 9:System.out.println("La fecha es : " + day + " de Septiembre de " + year);break;
                     case 11:System.out.println("La fecha es : " + day + " de Noviembre de " + year);break;
                                 }
                    }
                    else {
                    
                            }
            }
                
}}

