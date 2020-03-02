
package ejercicios;
import java.util.Scanner;
public class Ejercicio0204 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
         int m, n, z, s, r;
         
         System.out.println("Introduce tres números m, n y z");
         m = teclado.nextInt();
         n = teclado.nextInt();
         z = teclado.nextInt();
         
         if (m < 0 && n < 0 && z < 0){
             int p;
             
             p = m * n * z;
             System.out.println("El resultado del producto es " + p);
         }
         
         else {  if (m <= 0 || n <= 0 || z <= 0){
                
                    r = m + n + z;
                    System.out.println("La suma de los tres números es " + r);
                }
                else  {s = (m + n)*z;
                       
                       System.out.println("(m+n)*z =" + s);
                       
                }
         
         }
            
   
}}
