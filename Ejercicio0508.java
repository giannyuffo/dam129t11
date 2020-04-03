
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

public class Ejercicio0508 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
        
         StringBuilder newCad;
         String phrase, character,subPhrase;
         int position;
         
         
         System.out.println("Write the phrase.");
         newCad =new StringBuilder(teclado.nextLine());
         System.out.println("Write the position to replace the characters.");
         position=teclado.nextInt();
         System.out.println("Now, write the character to replace");
         character=teclado.next();
         
         char cha=character.charAt(0);
         newCad.setCharAt(position, cha);
         phrase=newCad.toString();
         System.out.println(phrase);
         
         // no di encotnrado forma para sustituir en la posicion exacta del string
         //los priblemas surgen cuand en la frase hay caracteres repetidos.
         //podriamos usar replace para poner todos los caracteres o, extraer un substring 
         //en la posición, reemplazarlo y concatenarlo a los otros dos string. (lleva mucho tiempo)
} //fin main     
} //fin clase