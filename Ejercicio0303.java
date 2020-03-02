
package ejercicios;
import java.util.Scanner;
public class Ejercicio0303 {
     public static void main(String[] args)  {
         Scanner teclado = new Scanner(System.in);
       
         int num=1, n;
         
        System.out.println("Introduce un número. Numero <=0 finaliza la operación.");
        
        while (num>0)
            {
            num=teclado.nextInt();
            if (num%2==0 && num>0)
                System.out.println(num + " es Par");
           
            else if(num>0)
                System.out.println(num+ " es Impar");
            }
     }}