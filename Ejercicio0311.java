
package ejercicios;
import java.util.Scanner;
public class Ejercicio0311 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
                
        int m,n, max, min, max1,min1, cuadrado;           
         m=teclado.nextInt();
         n=teclado.nextInt();
        if (m>n)
            {max=m-1;
            min=n+1;
            min1=min;
            max1=max;
            }
        else {
            max=n-1;
            min=m+1;
            min1=min;
            max1=max;
            }
        for (n=m;max>=min; min++)
            {
                System.out.println(min); 
            
                if (max==min)
                { System.out.println("Cuadrados de estos números:");
                    for (n=m;max1>=min1; min1++)
                        {
                        cuadrado=min1*min1;
                          System.out.println(cuadrado);
                        }
                }
            }
}}