package ejercicios; 
import java.util.Scanner;
public class Ejercicio0410 {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
    int day1,month1,year1,day2,month2, year2,totalDias1=0,totalDias2=0;
    boolean bien; 
     
     do{
     System.out.println("Introduce, en números, el día, mes y año de la primera fecha. Presiona enter entre cada acción y al finalizar");
    	 day1 = teclado.nextInt();
    	 month1 = teclado.nextInt();
    	 year1 = teclado.nextInt();
    	
        if ((day1 <= 0 || day1 >= 32) || (month1 <= 0 || month1 >= 13) || (year1 <= -1 || year1 >= 5000) )
        {	System.out.println("Algún valor es erróneo.Vuelve a intentarlo.");
                bien=false;
        }
    	else {
            do{
                 System.out.println("Introduce ahora, en números, el día, mes y año de la segunda fecha. Presiona enter entre cada acción y al finalizar");
                 day2 = teclado.nextInt();
                 month2 = teclado.nextInt();
                 year2 = teclado.nextInt();
            
                 if ((day1 <= 0 || day1 >= 32) || (month1 <= 0 || month1 >= 13) || (year1 <= -1 || year1 >= 5000) )
                {	
                    System.out.println("Algún valor es erróneo.Vuelve a intentarlo."); 
                    bien=false;
                }
                else {
                     totalDias1=numeroDiasMes(day1, month1, year1);
                     totalDias2=numeroDiasMes(day2, month2, year2);
                     
                     System.out.printf("Han pasado un total de %d días.",resta(totalDias1, totalDias2));
                     bien=true;
                 }
            }
            while(bien==false);
        }
     }
     while(bien==false);
}
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
public static int resta(int p, int q){
    int totalDias1=p,totalDias2=q, resta;
    
    resta=totalDias1-totalDias2;
   return Math.abs(resta);
}
}//fin clase