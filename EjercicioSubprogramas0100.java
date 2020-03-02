
package ejercicios;
import java.util.Scanner;
public class EjercicioSubprogramas0100 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
      long dividendo, divisor, suma=0;
     
     System.out.println("Números perfectos");
     
    for(dividendo=1; dividendo<999999999;dividendo++)
    { suma=0;
        for (divisor=1; divisor<dividendo; divisor++)
        {
           if(dividendo%divisor==0)
               {
                   suma=suma+divisor;
               }
           
        }
        if (dividendo==suma)
           System.out.println(suma);
    }
    
    
}}