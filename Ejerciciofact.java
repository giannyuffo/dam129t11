
package ejercicios;
import java.util.Scanner;
public class Ejerciciofact {
     public static void main(String[] args)  {
         
         Scanner teclado = new Scanner(System.in);
         
        
      
         int contador = 0;
         double totalfactura;
         System.out.println("Introduce factura");
         double factura=teclado.nextFloat();
         boolean  tochofactura = false;
         while (factura > 0){
             
             contador ++;
             totalFactura += factura;
             
             if (factura > 1000)
                        tochofactura = true;
             
            System.out.println("Introduce factura");
              factura=teclado.nextFloat();
             
             
             System.out.println(contador + "facturas");
             System.out.println("Total" + totalFactura);
             if (tochofactura = true) System.out.println("Hay factura cara" );
                     else System.out.println ("no hay factura cara");
        
         }
         
     
     
     
     }}