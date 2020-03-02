
package ejercicios;
import java.util.Scanner;
public class Ejercicio0307 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
                
             // El programa muestra los numeros divisores del numero introducido. 
             //Corregi varias cosas intercambiando los singos de caomparacion al principio, el ift, etc.
                int num;
                
                 
                 System.out.print("Introduce un número natural entre 1 y 1000: ");
                 num = teclado.nextInt();
                 
                 if (num >0 && num <= 1000)
                    {
                        for (int i=num ;num>=1; i--)
                           {if ( i>0 && num % i == 0 ) 
                             System.out.println(i);}
                    
                    }
                    
                 else             
                     System.out.println("Numero incorrecto.");
     }}