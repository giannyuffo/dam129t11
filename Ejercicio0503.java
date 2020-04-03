
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

public class Ejercicio0503 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        
       
        int  contador=0, position;
        String letter, cad;
        char lett;
        
        System.out.println("Write a phrase.");
        cad=teclado.next();
        
        System.out.println("Write the letter to count it.");
        letter=teclado.next();   
        
        //lett=letter.charAt(0); 
        //Otra posibilidad es pasando el String a tipo char y buscar la letra con indexOf();
        
        position=cad.indexOf(letter);
        
        while(position!=-1){
            contador++;
            position=cad.indexOf(letter, position+1);
        }
        System.out.printf("There are %d letters %s on the String.", contador, letter);
} //fin main     
} //fin clase