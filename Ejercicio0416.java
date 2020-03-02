package ejercicios; 
import java.util.Scanner;
public class Ejercicio0416 {    
/*22
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            int numEntradas=0, totalEntradas=0;
            System.out.println("Introduce el número de entradas a vender.");
            totalEntradas=teclado.nextInt();
            
            do{
                numEntradas=validarEntradas(totalEntradas);
                
                if(numEntradas<=totalEntradas){
                    totalEntradas=totalEntradas-numEntradas;
                }
                else{ 
                    System.out.printf("Solo tenemos disponibles %d entradas.", totalEntradas);
                    
                }
                if(numEntradas==0){
                break;}
                
            }//fin do
            while(totalEntradas!=0 || numEntradas!=0);
            
}//fin main
public static int validarEntradas(int t){
    Scanner teclado = new Scanner(System.in);
    int numEntradas=0, totalEntradas=t;
    do{
        System.out.println("¿Cuántas entradas quieres comprar? (0 break)");
        numEntradas=teclado.nextInt();

        if(numEntradas>10){
            System.out.println("No se permite comprar más"
                    + "de 10 entradas por persona. Introduzca otro número");
        }   
    }//fin do
    while(numEntradas>10 || numEntradas<-1);
    return numEntradas;
}
public static void menos10(int t){
    
}
}//fin class