
package ejercicios;
import java.util.Scanner;
public class Ejercicio0304 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
        int x, y=0, i;
        System.out.println("Introduce un número natural");
        x=teclado.nextInt();
        
        if (x>0)
            
            {for (i=0; i<=10 ; i++ )
                 {System.out.println(x*i);}
            }
        else 
           System.out.println("El número introducido es Negativo");
            }}