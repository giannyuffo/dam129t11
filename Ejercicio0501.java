
package ejercicios;
import java.util.Scanner;
public class Ejercicio0501 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        String cad = new String();
       
        int longitud;
       
        System.out.println("Introduce una orcación en Mayúsculas");
        cad=teclado.nextLine();
        String minus = cad.toLowerCase();
        System.out.println("Oración en minúsculas: " + minus);
        
        longitud = cad.length();
       
            
        
        
} //fin main     
} //fin clase