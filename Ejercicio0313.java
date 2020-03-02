
package ejercicios;
import java.util.Scanner;
public class Ejercicio0313 {
     public static void main(String[] args)  {
         
       Scanner teclado = new Scanner(System.in);
       
       int num;
       boolean posit;
       
       do {
       System.out.println("Introduce un número positivo");
       num=teclado.nextInt();
       }
       while(num<1);
       System.out.println("Número positivo introducido");
}}