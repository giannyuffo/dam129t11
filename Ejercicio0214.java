package ejercicios;
import java.util.Scanner;
public class Ejercicio0214{
 	public static void main(String[] args)  {
   	Scanner teclado = new Scanner(System.in);
    	int day1,day2, month1,month2,year1,year2;
    	System.out.println("Introduce el primer día");
    	day1 = teclado.nextInt();
        System.out.println("Introduce el segundo día");
        day2 = teclado.nextInt();
        System.out.println("Introduce el primer mes");
    	month1 = teclado.nextInt();
        System.out.println("Introduce el segundo mes");
        month2 = teclado.nextInt();
        System.out.println("Introduce el primer año");
    	year1 = teclado.nextInt();
        System.out.println("Introduce el segundo año");
    	year2 = teclado.nextInt();
    	
   	if (year1<year2)
          System.out.println(day1+ " de " +month1+ " de " +year1+" > "+day2 +" de "+month2+" de "+year2);
        else
            {
            if (year2<year1)
               System.out.println(day1+ " de " +month1+ " de " +year1+" < "+day2 +" de "+month2+" de "+year2);
            else
                {
                if (month1<month2)
                  System.out.println(day1+ " de " +month1+ " de " +year1+" < "+day2 +" de "+month2+" de "+year2);
                else 
                    {
                    if (month2<month1)
                      System.out.println(day1+ " de " +month1+ " de " +year1+" > "+day2 +" de "+month2+" de "+year2);
                    else
                        {
                        if (day1<day2)
                             System.out.println(day1+ " de " +month1+ " de " +year1+" < "+day2 +" de "+month2+" de "+year2);
                        else 
                            System.out.println(day1+ " de " +month1+ " de " +year1+" > "+day2 +" de "+month2+" de "+year2);
                        }
                    }
                }
            }
        
        
        }}

