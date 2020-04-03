
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

public class Ejercicio0506 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
        
         String subCad, cad;
         int position;
        
         System.out.println("Write the e-mail");
         cad=teclado.nextLine();
         
         position=cad.indexOf('@');
         subCad=cad.substring(position+1);
         
         System.out.printf("the domain is: %s",subCad);
} //fin main     
} //fin clase