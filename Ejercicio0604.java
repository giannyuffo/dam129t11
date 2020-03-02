
package ejercicios;
import java.util.Scanner;
public class Ejercicio0604 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        Ahorcado juego;
        int UserPista;
        String p= new String();
        String f = new String();
        boolean pista = false,adivinar, acierto;
        char letra;
        
        System.out.println("Introduce una palabra a divinar.");
        f = teclado.next();
        
        System.out.println("Da una pista");
        p=teclado.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "");
        System.out.println("¿Quieres una pista? (1: Sí o 2: No)");
        UserPista=teclado.nextInt();
        switch(UserPista){
            case 1: pista=true;break;
            case 2: pista=false;break;
        }
 
        if (pista== true)
            {juego = new Ahorcado (f, p);
            System.out.println(p);
            }   
        else 
            juego = new Ahorcado(f);
        
       do
       {   letra = juego.leerLetra();
           acierto= juego.probarLetra(letra);
           if (acierto==true)
               System.out.println("La letra está en la palabra");
           else 
               System.out.println("La letra no está en la palabra");
           juego.pintar();
           adivinar=juego.adivinada();
           if(adivinar==true)
              {System.out.println("HAz acertado");
                 break;
              }    
       }
       while (juego.perdio() == false);
      if(juego.perdio() == true)
          System.out.println("No haz acertado. GAME OVER");     
} //fin main     
} //fin clase