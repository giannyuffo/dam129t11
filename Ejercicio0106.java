package ejercicios;
import java.util.Scanner;
public class Ejercicio0106 {
    public static void main(String[] args)  {
        
        double cel, farh, cm, pulg;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Te pediré algunos datos para comenzar. ");
         System.out.println("Primero,necesito la temperatura obtenida en grados Celcius:21");
        cel = teclado.nextDouble();
        
        System.out.println("Ahora, la cantidad de auga obtenida en pulgadas ");
        pulg = teclado.nextDouble();
        
        farh = (cel*9.0/5) + 32;
        cm = 2.54d * pulg;
        
        System.out.println("Son " + farh + "ºF y " + cm + "cm");
        
        
        
        
    }
}
