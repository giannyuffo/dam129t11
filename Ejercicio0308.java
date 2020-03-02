
package ejercicios;
import java.util.Scanner;
public class Ejercicio0308 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
                
             int n, s=0;
             System.out.println("Introduce el número natural deseado");
             n = teclado.nextInt();
             for (int i =n; i<n+100; i++)
                {
                s+=i;
                }
             System.out.println("La suma de los siguientes 100 números es: " + s);
     }}