
package ejercicios;
import java.util.Scanner;
public class Ejercicio0206 {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
         int t, h, m, s;
        
        System.out.println("Introduce las horas");
        h = teclado.nextInt() * 3600;
        
        if (h > -1 & h < 86400)
                {System.out.println("Introduce los minutos");
                 m = 60 * teclado.nextInt();
                  if (m > -1 & m < 3600)
                        {System.out.println("Introduce los segundos");
                        s = teclado.nextInt();
                            if (s > -1 & s < 61)
                            {
                             t = h + m + s;
                            System.out.println("Son " + t + "segundos");
                            }
                           else System.out.println("Tiempo erróneo");
                        }
                 else System.out.println("Tiempo erróneo");
                }
        else System.out.println("Tiempo erróneo");
 }}