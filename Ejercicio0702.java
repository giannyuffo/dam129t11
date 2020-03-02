
package ejercicios;
import java.util.Scanner;  
import java.util.Locale;   
public class Ejercicio0702 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
     
        Primitiva sorteo = new Primitiva(); 
        int[] NumJugados = new  int [6];
        
        System.out.println("Introduce los números jugados");
        
        for (int i=0; i<6; i++)
        { 
          int num=teclado.nextInt();
          sorteo.NumJugados(num, i);
       }
        
        System.out.println("\n\n\n\n");
        sorteo.OrdenarJugados();
        sorteo.MostrarPantallaJugados();
        System.out.println("\n");
        sorteo.MostrarPantallaSorteados();
        
        System.out.println("\n\n\n\n");
        System.out.printf("Son necesarios %d para acertar 6 números",sorteo.SeisAciertos());
        
} //fin main   
} //fin clase