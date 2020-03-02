
package ejercicios;
import java.util.Scanner;
public class Ejercicio0309 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
                
         int n=0, total=0;
         System.out.println("Introduce números. EL programa parará sobrepasar 100 como resultado.");
         
         while (total<101)
            {
            
            n = teclado.nextInt();
            total = total + n;
            }
         System.out.println("El resultado total es: " + total);
     }}