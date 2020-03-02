
package ejercicios;
import java.util.Scanner;
public class Ejercicio0602 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        
        //numeroMovil = nM;
        //costeEstablecLlamada = cEL;
        //costeMinutoLlamada = cML;
        //costeConsumoMB = cMB;
        //saldo =s;
        int seg=0, mb=0, importe, menu, minutosConsumidos=0, megasConsumidos=0;
        final float cEL=0.12f, cML=0.15f, cMB=0.01f;
        float s=10;
        long   nM;
        int stop=0;
        
        
        //System.out.println("Coste establecimiento");
        //cEL=teclado.nextFloat();
        //System.out.println("Coste del min");
        //cML=teclado.nextFloat();
        //System.out.println("Coste del MB");
        //cMB=teclado.nextFloat();
        
        do
        { 
            System.out.println("Introduce el número de teléfono");
            nM=teclado.nextLong();
            if (nM < 600000000 || nM > 799999999)
                System.out.println("Número erróneo");       
        }
        while(nM < 600000000 || nM > 799999999);
        
        MovilPrepago movil1 = new MovilPrepago(nM, cEL, cML, cMB, s);
        
        do
        {
            System.out.println("\n Opción 1: Recargar Movil \n Opción 2: Ver Saldo Disponible \n Opción 3: Realizar llamada \n Opción 4: Navegar por Internet"
                    + "\n Opción 5: Ver minutos consumidos \n Opción 6: Ver megas consumidos \n Opción 7: Finalizar.");
            menu = teclado.nextInt();
            
            if (menu<1 || menu >7)
                 System.out.println("Opcion no reconocida.");
            else
            {
                switch (menu){
                        case 1:{
                                do
                                  {
                                   System.out.println("¿Cúanto quieres recargar?Recuerda que la recarga mínima son 5€.");
                                   importe=teclado.nextInt(); 
                                  }
                                while(importe%5!=0);
                                movil1.recargar(importe);
                                System.out.println("El nuevo saldo es: "+movil1.consultarSaldo()+"€");
                                }break;
                        case 2: System.out.println("El saldo restante es de: "+ movil1.consultarSaldo()+ "€");break;
                        case 3: {
                                System.out.println("Introduce el tiempo de la llamada en segundos.");
                                seg=teclado.nextInt();
                                movil1.efectuarLlamada(seg); 
                                System.out.println("El saldo restante es de: "+ movil1.consultarSaldo()+ "€");
                                } break;
                        case 4: {
                                System.out.println("Introduce los megas gastados");
                                mb=teclado.nextInt();
                                movil1.navegar(mb);
                                System.out.println("El saldo restante es de: "+ movil1.consultarSaldo()+ "€");
                                }break;
                        case 5: System.out.println("Haz consumido un total de: " + minutosConsumidos +" minutos.");break;
                        case 6: System.out.println("Haz consumido un total de: " + megasConsumidos);break;
                        case 7: stop=7;
                }
                minutosConsumidos=seg+minutosConsumidos;
                megasConsumidos= mb+megasConsumidos;
            }
        }
        while ( stop !=7  );
        System.out.println("Gracias por elegirnos. ¡Esperamos que tenga un buen día!");
          
} //fin main     
} //fin clase