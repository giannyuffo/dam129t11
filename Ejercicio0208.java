
package ejercicios;
import java.util.Scanner;
public class Ejercicio0208 {
     public static void main(String[] args)  {
         
         double a, b, c, d, e, f, x,y;
         boolean  den;
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("Resolver: ax + by = c; dx + ey = f ");
         System.out.println("Introduce los valores de las variables a, b, c, d, e y f");
                System.out.print("a ");
                a = teclado.nextInt();
                System.out.print("b ");
                b = teclado.nextInt();
                System.out.print("c ");
                c = teclado.nextInt();
                System.out.print("d ");
                d = teclado.nextInt();
                System.out.print("e ");
                e = teclado.nextInt();
                System.out.print("f ");
                f = teclado.nextInt();
            
            
            
            if     ((a*e)-(b*d)== 0) 
                    System.out.println("Denominador = 0");
            else {
                x = (double) (c*e-b*f)/(a*e-b*d);
                y = (double) ( a*f-c*d)/(a*e-b*d);
                System.out.println("Los resultados son: x=" + x + " e y=" + y);
                }
     }}
