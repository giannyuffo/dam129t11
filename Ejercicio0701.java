
package ejercicios;
import java.util.Scanner;
import java.time.*;  
import java.util.Locale;  
import java.time.format.TextStyle; 
public class Ejercicio0701 {
     static  int [] temperaturaMeses;
     public static void main(String[] args)  {
        
        Locale pais = new Locale("es", "ES");  
        Scanner teclado = new Scanner(System.in);     
        Month mes;
        String nomMes;
    
       temperaturaMeses = new int [12];
        
        //recorrerme cada una de las posiciones del arrays para escribir en ellas
        for (int i=0; i<12; i++)
        { 
            //llamo al arrays, i es la posicion de memoria que quiero llenar
            //llamo a la funcion para que me de un numero aleatorio entre parámetros.
            temperaturaMeses [i]= TemperaturaAleatoria();
            
            System.out.printf("En %s hubo una temperatura media de %d ºC.\n",NomMesTemp(i),temperaturaMeses[i] );
        }
        
        System.out.printf("\n\n La temperatura media en este año ha sido de: %+02.2f ºC.",TemperaturaMedia());
        System.out.printf("\n La temperatura máxima ha sido de: %+02.2f ºC.", TemperaturaMaxima());
        
        System.out.printf("\n El mes más frío ha sido %s.", NomMesTemp(TemperaturaMinima()));
        
        if (MasDeX ()!=-1)
            System.out.printf("\n El primer mes con más de %dº fue %s",gradosRegis(),NomMesTemp(MasDeX ()));
        
        temperaturaModa2();
} //fin main   
     private static int TemperaturaAleatoria(){
     
      int temperatura = 0,numeroP,numeroN;
      for (int i=0; i<temperaturaMeses.length;i++)
        {
         numeroP = (int) (Math.random()*35);
         
         
         numeroN = (int) -(Math.random()*10);
         
         if ((numeroP%2==0))
             temperatura=numeroN;
         else 
              temperatura = numeroP;
        }
      return temperatura;
     }
     private static float TemperaturaMedia(){
     
         int suma=0,temp;
         float media=0;
         for (int i=0; i<temperaturaMeses.length; i++)
        { 
            temp=temperaturaMeses [i];
            suma=temp+suma;
        }
         media=suma/temperaturaMeses.length;
         return media;
}
     private static float TemperaturaMaxima(){
      
       float temp, max=-10;
       for (int i=0; i<temperaturaMeses.length; i++)
        { 
            temp=temperaturaMeses [i];
            
            if (temp>max)
                max=temp;
        }
     return max;
     }
     private static int TemperaturaMinima(){
      
       float temp, min=50;
       int numMes = 0;
       
       
       for (int i=0; i<temperaturaMeses.length; i++)
        { 
            temp=temperaturaMeses [i];
            
            if (temp<min)
            {   
                min=temp;
                numMes=i;
            }
        }
     return numMes;
     }
      private static String NomMesTemp(int mes){
          
       Month mesMin;
       String nomMesMin;
       Locale pais = new Locale("es", "ES");
       int i;
           
          i=mes;
          mesMin = LocalDate.of(2018,i+1,1).getMonth();
          return nomMesMin=mesMin.getDisplayName(TextStyle.FULL_STANDALONE, pais);
          
      }
      private static int gradosRegis(){
         int gradosRegis;
         return gradosRegis=30;
      }
      private static int MasDeX (){
      
          int numMes = -1, i=0;
          boolean encontrado=false, fin=false;
         
         while (!encontrado && !fin)
         {
             if (gradosRegis()==temperaturaMeses [i]) 
             {encontrado=true;
             numMes =i;
             }
             
             else
                 if (i==temperaturaMeses.length-1)
                     fin=true;
                 else
                     i++;
                 
         }
          return numMes;
        //  do{for (int i=0; i<temperaturaMeses.length; i++){ 
        //             if (temperaturaMeses [i]>gradosRegis()){encontrado=true;numMes=i;}}}while(encontrado==true);
         //return numMes;
}

private static void temperaturaModa2 (){
   int cantVeces=0, maxVeces=0, moda=0;

   for(int i=0; i<temperaturaMeses.length; i++) {
      cantVeces = CantidadVeces (i); 
      if (cantVeces > maxVeces) { maxVeces = cantVeces; moda=temperaturaMeses[i];} //ver si más veces que previos
   }
   System.out.println("Temperatura más repetida: " + moda + " (" + maxVeces + " veces)");
}
private static int CantidadVeces (int posicion){
   int cantVeces=0; 
   for(int j=0; j<temperaturaMeses.length; j++) {
      if (temperaturaMeses[j] == temperaturaMeses[posicion]) cantVeces++; 
   }
   return cantVeces;
}  
} //fin clase