
package ejercicios;
import java.util.Scanner;
public class Ejercicio021201 {
public static void main(String[] args){
       
        Scanner teclado = new Scanner(System.in);
        int day, month,year, daysmonth=0, nameMonth;
        
        System.out.println("Introduce el mes");
        month = teclado.nextInt();
        System.out.println("Introduce el día");
        day = teclado.nextInt();
        System.out.println("Introduce el año");
        year = teclado.nextInt();
    
        if (month > 0 || month < 13)
            {
                
                switch (month)
                {
                    case 1: daysmonth=31; break;
                    case 2:{
                            if ((year % 4==0)&&(year % 100 !=0))
                                daysmonth=29;
                            else daysmonth=28;
                            }break;
                    case 3:daysmonth=31; break;
                    case 4:daysmonth=30; break; 
                    case 5:daysmonth=31; break;  
                    case 6:daysmonth=31; break;   
                    case 7:daysmonth=30;break;
                    case 8:daysmonth=31;break;
                    case 9:daysmonth=30; break;   
                    case 10:daysmonth=31;break;
                    case 11:daysmonth=30;break;
                    case 12:daysmonth=31;break;
                }
                if (day >0 && day < daysmonth)
                    System.out.println("La fecha es: " + day + " de " + daysmonth+ " de "+ year);
                else System.out.println("Día Erróneo");
            }
        
        
            
        else System.out.println("Mes Erróneo");
}}

