
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
import java.util.Scanner;
public class Ejercicio0511 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos!=-1) 
                cadenaSB.deleteCharAt(pos);
        }while (pos != -1);
        System.out.println(cadenaSB);
 
        //elimina los espacios en blanco. No detecto ningún error.
} //fin main     
} //fin clase