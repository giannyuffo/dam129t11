package ejercicios; 
import java.util.Scanner;
public class Ejercicio041304 {    
/*22
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
      int numero=0, numero2=8;
     for (int i = 9; i > 0; i--) {
         System.out.print(9); 
         for (int j = 0; j < numero; j++) {
             numero2--;
             System.out.print(numero2); 
         }
         numero2=9;
         numero++;
         System.out.println("\n");
    }
}//fin main
}//fin clase