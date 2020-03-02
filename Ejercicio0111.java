package ejercicios;
import java.util.Scanner;
public class Ejercicio0111 {
    public static void main(String[] args)  {
       
        double a, b, c, d, media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca las edades");
                a = teclado.nextDouble();
                b = teclado.nextDouble();
                c = teclado.nextDouble();
                d = teclado.nextDouble();
        if ( b > 0 & a > 0 & c > 0 & d > 0 
            & b <200 & a < 200 & c < 200 & d < 200) 
            
            {media = (a + b + c + d) / 4;
            System.out.println("La media de las edades es de " 
                    + media + " años."); 
            } 
        else System.out.println("Edades erróneas");    
       
    }
}