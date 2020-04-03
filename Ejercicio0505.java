
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

public class Ejercicio0505 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        
        int size, sizeAlfa, position;
        char letter;
        String pass="";
        Random rnd = new Random();
        String alfa="AaBbCcDdEeFfGgHhIiJj";
      
        do{
        size=(int) (Math.random()*11);
        }
        while(size>10 || size<5);
     
         for (int i = 0; i < size; i++) {
             
             do{
                position=(int) (Math.random()*alfa.length());
                letter=alfa.charAt(position);
             }
             while(pass.indexOf(letter)!=-1);
             pass +=letter;
         }
         System.out.printf("Your password is: %s",pass);
} //fin main     
} //fin clase