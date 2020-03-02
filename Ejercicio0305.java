
package ejercicios;
import java.util.Scanner;
public class Ejercicio0305 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
        int num=0, n=0;
         
       System.out.println("Ve introduciendo los números naturales para sumar. (-1=FIN)");
       while ( n >= 0)
       {
           n= teclado.nextInt();
           if (n>-1)
            { 
                
                num = n + num;
                System.out.println(num);
            }
       else System.out.println("Fin");
       }
       
     }
 

     }