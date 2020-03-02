package ejercicios; 
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Ejercicio0409HacerFinalesvacaciones {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
    int day,month, year,diasTotales=0,diaActual,diaEnero=0;
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
            
            System.out.printf("Dime ahora qué día fue el 1 de enero de %d\n",year );
            diaEnero=teclado.nextInt();
            //System.out.println(diaActual(teclado.nextInt(),day,month,year));
            
            
            
           numeroDiasMes(day, month, year, diaEnero);
                bien=true;
        }
     }
     while(bien==false);
     
     
}
public static int numeroDiasMes(int d, int m, int y, int e){
    
    int day=d,month=m, year=y,diaEnero=e, daysmonth=0,total=0,totalFinal=0,inversa=0;
            	
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
   
        total=total+daysmonth;
    }
        inversa=daysmonth-day;
        totalFinal=total-inversa;
        double numDia= ContadorDias(total, diaEnero);
        if(numDia==0.142857)
        return diaEnero;  
}
public static double ContadorDias(int t, int e){
   int diaEnero=e,numDiasTrans=t;int division;
    
    double numero = numDiasTrans/7;
    System.out.printf("El número originalmente es: %f\n", numero);
    double parteDecimal = numero % 1; // Lo que sobra de dividir al número entre 1
    double parteEntera = parteDecimal - numero; // Le quitamos la parte decimal usando una resta
    
    DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
    separadoresPersonalizados.setDecimalSeparator('.');

    DecimalFormat formato1 = new DecimalFormat("#.000000", separadoresPersonalizados);

    System.out.println(formato1.format(parteDecimal)); // Resultado => 3.33
    
    return parteDecimal;
   
   
   
   
   
   
   
   
}
//public static int diaActual(int e, int d, int m, int y){
//    int dayEnero=d,contador,semana=0,diasTotales,day=d,month=m,year=y;
    
  //  diasTotales=numeroDiasMes(day,month, year);
    //for(int i=1;i<diasTotales+1;i++)
    //{
      //  if (i%7==0)
       // {
        //semana++;
        //}
    //}
    

//return semana;
//}
} //fin clase