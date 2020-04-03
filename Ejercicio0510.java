
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

public class Ejercicio0510 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
         StringBuilder phrase, subPhrase=new StringBuilder();
         char ch;
         
         for (int i = 0; i <10; i++) {
             System.out.println("Write the phrase");
             phrase=new StringBuilder(teclado.next());
             
             ch=phrase.charAt(0);
             
             subPhrase.append(ch);
         }
         System.out.println(subPhrase);
} //fin main     
} //fin clase