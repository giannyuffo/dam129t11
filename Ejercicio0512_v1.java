
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
public class Ejercicio0512_v1 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean ok=false, di=true, repeat=false;
        char p;
        int pos, contador1=0;
        String digits;
        StringBuilder c1= new StringBuilder();
        StringBuilder c2= new StringBuilder();
        
        do{
            System.out.println("Write 6 numbers that aren´t reapeted.");
            digits=teclado.nextLine();
            
            //indicar que no introjudo un número con la longitud pedida
            if(digits.length()!=6){
                System.out.println("Rewrite it with the stablished extention.");
            }
            else{
                //indicar que algún carcater no es número.
                for (int i = 0; i < digits.length(); i++) {
                    di=Character.isDigit(digits.charAt(i));
                }
                if(di==false){
                    System.out.println("One or more characters aren´t number(s).");
                }
                else{
                    //buscar caracteres repetidos.
                    for (int i = 0; i <6; i++) {
                        
                        c1.setCharAt(0,digits.charAt(i));
                        
                        for (int j = 0; j <6; j++){
                        c2.setCharAt(0, digits.charAt(i));
                        repeat=c1.equals(c2);
                        }
                        
                    }
                    if(repeat==true){System.out.println("There are some numbers reapeted");}
                    else{System.out.println("Ok!");ok=true;}
                }
            }
        }
        while(ok==false);
//no lo doy conseguido.        
} //fin main     
} //fin clase