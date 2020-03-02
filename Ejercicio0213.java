package ejercicios;
import java.util.Scanner;
public class Ejercicio0213{
 	public static void main(String[] args)  {
   	Scanner teclado = new Scanner(System.in);
    	int day, month,year, daysmonth=0;
    	System.out.println("Introduce el día, mes (número) y año. Presiona enter entre cada acción y al finalizar");
    	day = teclado.nextInt();
    	month = teclado.nextInt();
    	year = teclado.nextInt();
    	
   	
    	
    	if ((day <= 0 || day >= 32) || (month <= 0 || month >= 13) || (year <= -1 || year >= 5000) )
        	System.out.println("Algún valor es erróneo");
    	
    	else {
            	switch (month)
            	{
                	case 1: daysmonth=31;break;
                	case 2: if ((year%4 == 0) && (year%100>0) || (year%400 == 0))
                                	daysmonth=29;
                        	else	
                            	daysmonth=28; break;
                	case 3:daysmonth=31;break;
                	case 4:daysmonth=30;break;
                	case 5:daysmonth=31;break;
                	case 6:daysmonth=30;break;
                	case 7:daysmonth=31;break;
                	case 8:daysmonth=31; break;
                	case 9:daysmonth=30;break;
                	case 10:daysmonth=31; break;
                	case 11:daysmonth=30; break;
                	case 12:daysmonth=31; break;
            	}
            	
            	if (month !=12 && day <= daysmonth)
                        {
                    	if (month!=2 )
                            { if (day != daysmonth)
                                {
                         	day++;
                         	month=month;
                         	year=year;
                         	System.out.println("El día siguiente es: " + day + " de " + month + " de " + year);
                                }  
                              else
                                {  
                                day =1;
                                month++;
                                year=year;
                                System.out.println("El día siguiente es: " + day + " de " + month + " de " + year);
                                } 
                            }
                        else
                            { if (day != daysmonth)
                                {
                         	day++;
                         	month=month;
                         	year=year;
                         	System.out.println("El día siguiente es: " + day + " de " + month + " de " + year);
                                }  
                              else
                                {  
                                day =1;
                                month++;
                                year=year;
                                System.out.println("El día siguiente es: " + day + " de "+month+" de " + year);
                                } 
                            }
                            
                        }
                        
                        
                        
                        
                else
                        {
                    	if (day <=  daysmonth)
                        {
                            if (day != daysmonth)
                            {
                                    day++;
                                    month=month;
                                    year=year;
                                    System.out.println("El día siguiente es: " + day + " de " + month + " de " + year);
                            }  
                            else
                            {  
                                    day =1;
                                    month=1;
                                    year++;
                                    System.out.println("El día siguiente es: " + day + " de " + month + " de " + year);
                            }
                        }
                        else System.out.println("El día no existe");
                         }
}}}

