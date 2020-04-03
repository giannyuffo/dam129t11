
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
public class Ejercicio0513 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String number,st;
        boolean di = false;
        number=teclado.nextLine();
        
        for (int i = 0; i < number.length(); i++) {
          di=Character.isDigit(number.charAt(i));
        }
        if(di==false){
            System.out.println("One or more characters aren´t number(s).");
        }
        else{
                double no = Double.parseDouble(number);
                String hex = Double.toHexString(no);
                System.out.println("Hex value is " + hex);
        }
} //fin main     
} //fin clase