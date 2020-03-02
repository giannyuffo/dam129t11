package ejercicios;
import java.util.Scanner;
public class Ejercicio0110 {
    public static void main(String[] args)  {
       
        double km0, km1, L0, L1, LxKm, kmrec, Lcons;
        // km al repostar, km actuales, Litros al respotar, litros actuales.
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Kilometraje al repostar ");
        km0 = teclado.nextDouble();
        
        System.out.println("Kilometraje actual ");
        km1 = teclado.nextDouble();
      
        System.out.println("Litros al repostar");
        L0 = teclado.nextDouble();
        
        System.out.println("Litros actuales");
        L1 = teclado.nextDouble();
        
        kmrec = km1 - km0;
        Lcons = L0 - L1;
        
        LxKm = (double) Lcons/ (double) kmrec;
        
        
        System.out.println("Consumo " + LxKm + "L/km");
        
       
    }
}