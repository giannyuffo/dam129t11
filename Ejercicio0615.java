
package ejercicios;
import java.util.Scanner;
public class Ejercicio0615 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        
        
        int apostar, numeroAzar, elegir, premio, x=0, ganado=0;
        boolean par=false, numero=false;
        Ruleta  r;  
        
            System.out.println("¿Quieres apostar a par (1), impar (2)?");
            elegir=teclado.nextInt();
        
       
            switch(elegir){
                case 1: 
                    System.out.println("Estás apostando a par");
                    par=true;break;
                case 2: 
                    System.out.println("Estás apostando a impar");
                    par=false;break;
                //case 3: 
                    //System.out.println("Estás apostando a número");
                    //numero=true;
                    //System.out.println("¿A qué número quieres apostar?");
                    //numApostar=teclado.nextInt();
                    //break;
            }

            System.out.println("¿Cuánto quieres apostar?");
            apostar=teclado.nextInt();


            r = new Ruleta(apostar, par);

            for ( int i=1; i<=100000; i++)
             {  
                 numeroAzar=r.NumeroAzar();
                 premio=r.Premio();

                 //System.out.println("Ha salido: " + numeroAzar + ". Ganaste: " + premio);
                 ganado=premio+ganado;
             }
             System.out.println("Tienes en banca: "+ganado);
        
} //fin main     
} //fin clase