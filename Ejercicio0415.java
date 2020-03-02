package ejercicios; 
import java.util.Scanner;
public class Ejercicio0415 {    
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

            System.out.println("Introduce el rango de números");
            int num1=teclado.nextInt();
            int num2=teclado.nextInt();
            
            if(num1>num2){
                int comodin = 0;
                comodin=num1;
                num1=num2;
                num2=comodin;
            }
            
            int suma = 0, producto = 1;
            double media;
            for (int i = num1+1; i < num2; i++) {
             if(i%2==0){
                suma=i+suma;
                producto=i*producto;
             }
            }//fin for
            media=suma/2;
            System.out.printf("La suma de los números pares comprendidos entre "
                    + "%d y %d es: %d.\n El producto es: %d y la Media es: %f.\n", num1, num2, suma,producto, media);

}
}