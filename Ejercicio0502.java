
package ejercicios;
import java.util.Scanner;
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

public class Ejercicio0502 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        String allLetters="TRWAGMYFPDXBNJZSQVHLCKE";
        char letter;
        long number;
        int rest;
         System.out.println("Write the ID'numbers");
         number = teclado.nextLong();
         
         rest=(int)(number%23);
         letter= allLetters.charAt(rest);
        
         System.out.println(letter);
         
} //fin main     
} //fin clase