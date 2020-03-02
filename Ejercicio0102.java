
package ejercicios;
import java.util.Scanner;
public class Ejercicio0102 {
    public static void main(String[] args) {
        
        double dolares, euros;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuántos dólares son?");
        dolares = teclado.nextDouble();
        euros = dolares/1.14;
        
        System.out.println("Son " + euros + " euros");
        
        
        
    }
    
}
