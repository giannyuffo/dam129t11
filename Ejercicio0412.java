package ejercicios; 
import java.util.Scanner;
public class Ejercicio0412 {    
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
     int contador;
  
     do{ 
        System.out.println("Dime cuántas veces quieres mostrar el mensaje por pantalla. 0 stop.");
        contador=teclado.nextInt(); 
        for (int i = 0; i <contador; i++) {
              if(i%2==0)
              {  
                  System.out.println("hola");
              }
              if(i%2!=0)
              //else
              {  
                  System.out.println("Adios");
              }
        }  
     }
     while(contador!=0);
}    
}//fin clase