
package ejercicios;
import java.util.Scanner;
import java.util.Random;
/*

 * @author uffog
 * 
 * Ctrl + Space                 completar
   Alt + Insert                 varias opciones
   Ctrl + R                     refactorizar
   fcom + Tab                   comentarios
   fori + Tab                      for
   sout + Tab o soutv + Tab   ...pintln...
   iff + Tab                       if
   sw + Tab                      switch
 * 
*/

public class Ejercicio0509 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
        
         String name;
         int age;
         
         System.out.println("Enter your full name.");
         name=teclado.nextLine();
         System.out.println("Enter now your age.");
         age=teclado.nextInt();
         
         System.out.printf("Hi, my name is %s and I'm %d years old.", name, age);
} //fin main     
} //fin clase