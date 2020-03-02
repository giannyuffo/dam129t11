package ejercicios; 
import java.util.Scanner; 
public class Ejercicio0113
{     
    public static void main(String[] args) {                  
       double cat1, cat2, hipo;                  
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.print("Introduce el valor del primer cateto: ");         
        cat1 = teclado.nextDouble();         
        
        System.out.print("Ahora el del segundo: ");         
        cat2 = teclado.nextDouble();
        
        hipo = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        System.out.println("La hipotenusa vale: " + hipo);             
       
    
    
    
    
    
 }}