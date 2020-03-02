
package ejercicios;
import java.util.Scanner;
public class Ejerciciowhile {
    public static void main(String[] args) {
    //Ejercicio 1.1
          
       
        
        
        
        
        
        do {
        
       Scanner teclado = new Scanner (System.in);
       
     
       
       
       
       System.out.print("Introduce opcion ");
       opcion = teclado.nextDouble ();
       switch (opcion){
           case 1: diasDelmes(); break;
           case 2: diaSiguiente(); break;
           case 3: diaAnterior();
       }
       while (opcion!=3);
       
           
       }
       
       System.out.println("Son " +  dolares + " dólares.");
       
       
        
    }
    
}
