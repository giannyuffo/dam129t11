
package ejercicios;
import java.util.Scanner;
public class Ejercicio02101 {
     public static void main(String[] args)  {
         
        int  hora, day;
        
        
         Scanner teclado = new Scanner(System.in);
       
        System.out.println("Introduce el númrero de dia (1-7)");
         day = teclado.nextInt();
        System.out.println("Introduce la hora(9hrs - 14hrs)");
         hora = teclado.nextInt();
         
        if ( (hora == 10 || hora == 14) && day!=6)
            System.out.println("Hay bus");
        else {
            if ((hora == 9 || hora == 11 ) && day == 7 )
                System.out.println("Hay bus");
            else {
                if (hora ==  12 && (day == 4 || day == 7))
                    System.out.println("Hay bus");
                else {
                    if (hora == 13 && (day == 3 || day == 7))
                        System.out.println("Hay bus");
                    else System.out.println("No hay bus");
                      }
                
                }
            }
        
     }}
