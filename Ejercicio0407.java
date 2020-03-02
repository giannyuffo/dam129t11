package ejercicios; 
import java.util.Scanner;
public class Ejercicio0407 {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
     int numero, suma=0,vecesNumero=0;
       do{
           System.out.println("\nIntroduce un número para sumarlo.");
           numero=teclado.nextInt();
           
           if(numero<1001)
           {
                suma=numero+suma;
                System.out.printf("\nLa suma es:%d",suma);
                vecesNumero++;
           }
           if(numero>1000)
           {break;}
       }
       while(vecesNumero!=15);
       System.out.println("\nFin");
} //fin main
} //fin clase