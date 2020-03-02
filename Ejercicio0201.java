
package ejercicios;
import java.util.Scanner;
public class Ejercicio0201 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
         int a, b;
         
         System.out.println("Introduce un número");
         a = teclado.nextInt();
         
         if (a % 2 == 0)
             System.out.println("Es un número par.");
         else System.out.println("Es un número impar.");
         
         
     }
    
}
