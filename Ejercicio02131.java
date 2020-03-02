package ejercicios;
import java.util.Scanner;
public class Ejercicio02131{
 	public static void main(String[] args)  {
   	Scanner teclado = new Scanner(System.in);
    	int day, month,year, daysmonth=0; String nombreMes="Mes";
    	System.out.println("Introduce el día, mes (número) y año. Presiona enter entre cada acción y al finalizar");
    	day = teclado.nextInt();
    	month = teclado.nextInt();
    	year = teclado.nextInt();
    	
   	
    	
    	if ((day <= 0 || day >= 32) || (month <= 0 || month >= 13) || (year <= -1 || year >= 5000) )
        	System.out.println("Algún valor es erróneo");
    	
    	else {
            	switch (month)
            	{
                	case 1: daysmonth=31;nombreMes="Enero";break;
                	case 2: if ((year%4 == 0) && (year%100>0) || (year%400 == 0))
                                    {daysmonth=29; nombreMes="Febrero";}
                        	else	
                            	daysmonth=28; nombreMes="Febrero"; break;
                	case 3:daysmonth=31;nombreMes="Marzo";break;
                	case 4:daysmonth=30;nombreMes="Abril";break;
                	case 5:daysmonth=31;nombreMes="Mayo";break;
                	case 6:daysmonth=30;nombreMes="Junio";break;
                	case 7:daysmonth=31;nombreMes="Julio";break;
                	case 8:daysmonth=31;nombreMes="Agosto"; break;
                	case 9:daysmonth=30;nombreMes="Septiembre";break;
                	case 10:daysmonth=31;nombreMes="Octubre"; break;
                	case 11:daysmonth=30; nombreMes="Noviembre";break;
                	case 12:daysmonth=31; nombreMes="Diciembre";break;
            	}
            	
            	if (month !=12 && day <= daysmonth)
                        {
                    	if (month!=2 )
                            { if (day != daysmonth)
                                {
                         	day++;
                         	
                         	year=year;
                         	System.out.println("El día siguiente es: " + day + " de " + nombreMes + " de " + year);
                                }  
                              else
                                {  
                                day =1;
                               
                                year=year;
                                System.out.println("El día siguiente es: " + day + " de " + nombreMes + " de " + year);
                                } 
                            }
                        else
                            { if (day != daysmonth)
                                {
                         	day++;
                         	month=month;
                         	year=year;
                         	System.out.println("El día siguiente es: " + day + " de " + nombreMes + " de " + year);
                                }  
                              else
                                {  
                                day =1;
                                month++;
                                year=year;
                                System.out.println("El día siguiente es: " + day + " de "+ nombreMes +" de " + year);
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
                                    System.out.println("El día siguiente es: " + day + " de " + nombreMes + " de " + year);
                            }  
                            else
                            {  
                                    day =1;
                                    month=1;
                                    year++;
                                    System.out.println("El día siguiente es: " + day + " de " + nombreMes + " de " + year);
                            }
                        }
                        else System.out.println("El día no existe");
                         }
}}}

