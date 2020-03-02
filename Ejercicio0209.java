
package ejercicios;
import java.util.Scanner;
public class Ejercicio0209 {
     public static void main(String[] args)  {
         
         int ano;
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce el año");
         ano = teclado.nextInt();
         
         if ((ano%4 == 0) && (ano%100>0) || (ano%400 == 0))
             System.out.println("El año es biciesto");
         else System.out.println("El año no es biciesto");
     }}
