
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

public class Ejercicio0507_v2 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
        
         String subCad="", cad;
         int uno;
         char caracter, caracterEncrypted,dos, tres;
         String alfa="AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvXxYyZz";
         String beta="oIuYtReWqAsDfhGJkLñMnBvCxZiUyTrEwQÑlKjHgFdSaNbVcXzOm";
         
         System.out.println("Write the phrase to encrypt it");
         cad=teclado.nextLine();
         
         for (int i = 0; i < cad.length(); i++) {
             caracter=cad.charAt(i);
             if(Character.isSpaceChar(caracter)==false && Character.isDigit(caracter)==false)
             {uno=alfa.indexOf(caracter);
             dos=beta.charAt(uno);
             subCad +=dos;}
             else 
             {subCad+=caracter;}
         }
         System.out.printf("the encrypted phrase is: %s \n",subCad);
} //fin main     
} //fin clase