
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

public class Ejercicio0507 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);     
        
         String subCad,subCad2, cad;
        
         System.out.println("Write the phrase to encrypt it");
         cad=teclado.nextLine();
         
         subCad=cad.replace("A","F");
         subCad2=subCad.replace("B","X");
         subCad=subCad2.replace("C", "M");
         
         System.out.printf("the encrypted phrase is: %s",subCad);
} //fin main     
} //fin clase