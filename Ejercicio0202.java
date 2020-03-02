
package ejercicios;
import java.util.Scanner;
public class Ejercicio0202 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
         int m, n;
         
         System.out.println("Introduce dos números m y n");
         m = teclado.nextInt();
         n = teclado.nextInt();
         
         if (m > n)
             System.out.println("m es mayor que n");
         else System.out.println("m no es mayor que n");

         if (n == 0)
             System.out.println("n no es divisor de m");
         
         else   { if (m % n == 0)
                 System.out.println("n es divisor de m");
                       
                else System.out.println("n no es divisor de m");
                }
}}
