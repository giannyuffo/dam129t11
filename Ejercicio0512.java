
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
public class Ejercicio0512 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        StringBuilder di =new StringBuilder();
        String d;
        char digit;
        boolean stop=false;
        int contador=0,pos, contador2=0, contador3=0;
        
        do{
            System.out.println("Write a String of six numbers.");
            d=teclado.nextLine();
            
            if(d.length()!=6){
                System.out.println("Rewrite it with the stablished extention.");
            }
            else{
                for (int i = 0; i < d.length(); i++) {
                   digit=d.charAt(i);
                   if(Character.isDigit(digit)==true)
                   {contador2++;}
                }
                if(contador2!=6){System.out.println("Not all the"
                        + "characters are digits.");}
                else{
                    for (int i = 0; i <10; i++) {
                        pos=d.indexOf(i);
                        if(pos!=-1)
                        {   contador3++;
                            if(contador3>0){System.out.println("There are "
                                + " some numbers repeated.");}
                            
                        }
                        
                    }
                }
            }
        }
        while(contador!=6 );
        //&& stop==true
} //fin main     
} //fin clase