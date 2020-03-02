package ejercicios; 
import java.util.Scanner;
public class Ejercicio041303 {    
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
     long numero=0;
     for (int i = 1; i <10; i++) {
         for (int j = 11; j > i; j--) {
             System.out.print(i);
         }
          System.out.println("\n");
    }
}    
}//fin clase