
package ejercicios;
import java.util.Scanner;
public class Ejercicio0403 {
     
     public static void main(String[] args)  {
     
         Scanner teclado = new Scanner(System.in);
       boolean tiene;
         for(int i=2;i<1001;i++)
         {
             int numero=i;
              tiene=false;
              
             for(int j=2;j<numero;j++)
              {
                  int division=numero%j;
                  
                  if(division==0)
                  {
                      
                  tiene=true;
                  
                  }
                  
              }
             if(tiene==false)
             {
             System.out.println(numero);
             }
             
         }
} //fin main     
} //fin clase