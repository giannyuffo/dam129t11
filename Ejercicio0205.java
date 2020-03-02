
package ejercicios;
import java.util.Scanner;
public class Ejercicio0205 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
         double m, n, z;
         
         System.out.println("Introduce la nota del examen");
         m = teclado.nextDouble();
         
         System.out.println("Introduce la valoración del trabajo en clase");
         n = teclado.nextDouble();
         
         System.out.println("Introduce la nota del trabajo práctico");
         z = teclado.nextDouble();
         
         if ( (m > 10 || m < 0 )|| (n > 10 || n < 0) || (z > 10 || z < 0))
                        System.out.println("Notas introducidas erróneamente");
                                
                               
         else {if (m >= 5 || m > 4 & n > 5 & z > 5 || m > 4 & ( n > 8 || z > 8))
                
             System.out.println("Aprobado");
         
         else System.out.println("Suspenso");
             
        

         }
 
     }}