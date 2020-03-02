

package ejercicios;
import java.util.Scanner;
public class Ejercicio0215 {
     public static void main(String[] args)  {
       Scanner teclado = new Scanner(System.in);
        
        int mark;
        System.out.println("Write your mark to know your qualification");
        mark = teclado.nextInt();
        
        if (mark <0 || mark > 10)
           System.out.println("Notas erróneas");
        else 
        {
            if (mark>-1 && mark < 3 )
              System.out.println("la cualificacion es Muy Deficiente");
            else 
            {
                if (mark > 2 && mark < 5)
                    System.out.println("la cualificacion es Insuficiente");
                 else
                {
                    if (mark > 4 && mark < 7)
                        System.out.println("la cualificacion es Aprobado");
                    else 
                    {
                        if (mark > 6 && mark < 9 )
                            System.out.println("la cualificacion es Notable");
                        else System.out.println("la cualificacion es Sobresaliente");
                    }
                }
            }
        }
        
        }}
