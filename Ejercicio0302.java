
package ejercicios;
import java.util.Scanner;
public class Ejercicio0302 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
        long n, i;
         
        System.out.println("Introduce el número de números naturales a calcular.");
        n= teclado.nextLong();
        for (i=1; i<=n ; i++ )
            {System.out.println(i);}
     }
 

     }