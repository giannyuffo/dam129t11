
package ejercicios;

/*
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
import java.util.Scanner;
public class Ejercicio0614 {

    public static void main(String[] args)  {
        
       Scanner teclado = new Scanner(System.in);
       Pistola rusa = new Pistola();
       boolean fin;
       int contador=1;
       String num;
        System.out.println("Comienza el juego. Pulsa ENTER cuando vayas a disparar.");
        num=teclado.nextLine();
        
        rusa.comenzarJuego();
        do{
            
            fin=rusa.jugar(contador);
            System.out.println("Cambio de turno, pulsa ENTER para continuar");
             num=teclado.nextLine();
            contador++;
        }
        while(fin!=true);
            System.out.println("Moriste.");
    }
} //fin clase