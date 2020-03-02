package ejercicios; 
import java.util.Scanner;
public class Ejercicio041302 {    
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
     for (int i = 0; i <9; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print(i);
         }
          System.out.println("\n");
    }
}    
}//fin clase