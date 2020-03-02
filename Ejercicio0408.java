package ejercicios; 
import java.util.Scanner;
public class Ejercicio0408 {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
     int day,month, year,diasTotales=0;
     boolean bien; 
     
     do{
     System.out.println("Introduce el día, mes (número) y año. Presiona enter entre cada acción y al finalizar");
    	 day = teclado.nextInt();
    	 month = teclado.nextInt();
    	 year = teclado.nextInt();
    	
        if ((day <= 0 || day >= 32) || (month <= 0 || month >= 13) || (year <= -1 || year >= 5000) )
        {	System.out.println("Algún valor es erróneo");
                bien=false;
        }
    	else {
            diasTotales=numeroDiasMes(day,month, year);
                bien=true;
        }
     }
     while(bien==false);
     
     
     
     System.out.printf("Han transcurridos desde el 1 de enero de %d un total de: %d días.",year,diasTotales);
           
          
} //fin main
static int numeroDiasMes(int d, int m, int y){
    
    int day,month, year, daysmonth=0,total=0,inversa=0;
        day=d; month=m; year=y; 
            	
    for(int i=0;i<month; i++)
    
    {switch (i)
            {
                    case 0: daysmonth=31;break;
                    case 1: if ((year%4 == 0) && (year%100>0) || (year%400 == 0))
                                    daysmonth=29;
                            else	
                            daysmonth=28; break;
                    case 2:daysmonth=31;break;
                    case 3:daysmonth=30;break;
                    case 4:daysmonth=31;break;
                    case 5:daysmonth=30;break;
                    case 6:daysmonth=31;break;
                    case 7:daysmonth=31; break;
                    case 8:daysmonth=30;break;
                    case 9:daysmonth=31; break;
                    case 10:daysmonth=30; break;
                    case 11:daysmonth=31; break;
            }
    if(i<=month)
    {
        if(i==month-1)
        {inversa=daysmonth-day;}
        
        total=daysmonth+total-inversa;
    
    }
    }  
    
        return total;
}
} //fin clase