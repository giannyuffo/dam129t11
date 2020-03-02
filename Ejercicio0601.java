
package ejercicios;
import java.util.Scanner;
public class Ejercicio0601 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        
        //numeroMovil = nM;
        //costeEstablecLlamada = cEL;
        //costeMinutoLlamada = cML;
        //costeConsumoMB = cMB;
        //saldo =s;
        int seg, mb=0, importe;
        float cEL=0, cML=0, cMB=0,s=10;
        long   nM=0;
       
        do
        { 
            System.out.println("Introduce el número de teléfono");
            nM=teclado.nextLong();
            if (nM < 600000000 || nM > 799999999)
                System.out.println("Número erróneo");
                
        }
        while(nM < 600000000 || nM > 799999999);
        
        System.out.println("Coste establecimiento");
        cEL=teclado.nextFloat();
        System.out.println("Coste del min");
        cML=teclado.nextFloat();
        System.out.println("Coste del MB");
        cMB=teclado.nextFloat();
        
        MovilPrepago movil1 = new MovilPrepago(nM, cEL, cML, cMB, s);
        MovilPrepago movil2 = new MovilPrepago(nM, cEL, cML, cMB, s);
        
        System.out.println("Introduce el tiempo de la llamada en segundos.");
        seg=teclado.nextInt();
        movil1.efectuarLlamada(seg); 
        System.out.println("El saldo restante es de: "+ movil1.consultarSaldo()+ "€");
        
        System.out.println("Introduce los megas gastados");
        mb=teclado.nextInt();
        movil1.navegar(mb);
        System.out.println("El saldo restante es de: "+ movil1.consultarSaldo()+ "€");
        
        do
        {
            System.out.println("¿Cúanto quieres recargar?Recuerda que la recarga mínima son 5€.");
            importe=teclado.nextInt(); 
        }
        while(importe%5!=0);
        
        movil1.recargar(importe);
        System.out.println("El nuevo saldo es: "+movil1.consultarSaldo()+"€");
        
        
        
} //fin main     
} //fin clase