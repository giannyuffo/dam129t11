
package ejercicios;
import java.util.Scanner;
public class Ejercicio060301 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);   
        String IBAN;
        int longitud, opcion=0, stop=0, continuar=0, contador=0;
       boolean descubierto;
        float importe, minimoComision,comisionPorc, saldo=0; 
       
        do  {
            System.out.println("Introduce el IBAN de tu cuenta. Recuerda: 24 dígitos.");
            IBAN = teclado.next();
            }
        while(IBAN.length()!=24);
        
        CuentaCorriente cuenta1 = new CuentaCorriente(IBAN);
      //Comisiones fijas establecidas para todas las cuentas
      //porcentajeComision = pc;
      //minimoComision = mc;
      cuenta1.setComision(0.01f,0.5f);
      
      //elegir en un menu las opciones que se desean
      do{
        System.out.println("¿Qúe operación desea realizar?"
              + "\n Opción 1: Ingresar dinero. \n Opción 2: Retirar dinero. \n Opción 3 \n Opción 4 \n Opción 5: Finalizar.");
        do{
          opcion=teclado.nextInt();
           if (opcion<0 || opcion>10)
               System.out.println("Opción errónea, introduce una opción válida");
          }
        while(opcion<0 || opcion>10);
       
        // menu que realiza operaciones segun se ha querido.
        switch(opcion){
            case 1:{//ingreso
                System.out.println("Introduce el importe a ingresar en cuenta.");
                importe= teclado.nextFloat();
                cuenta1.ingresar(importe);
                saldo = cuenta1.getSaldo();
                System.out.println("El saldo de tu cuenta es: "+saldo+"€");          
            } break;
            case 2:{//retirada
                System.out.println("Introduce la cantidad que deseas retirar.");
                importe =teclado.nextInt();
                descubierto=cuenta1.retirar(importe);
                
                comisionPorc=cuenta1.getPorcentajeComision();
                minimoComision = cuenta1.getMinimoCosmision();
                
                if (descubierto==false)
                  System.out.println("Saldo inferior en cuenta, intente otra cantidad más pequeña.");
                else
                {
                    System.out.println("La operación tiene una comisión de: "+ comisionPorc +"% y un coste mínimo de: "+minimoComision
                            + "€ ¿Quieres continuar? (1-Sí o 2-No)");
                    do{
                    continuar=teclado.nextInt();
                        if (continuar<1 || continuar > 2)
                            System.out.println("Opción inválida. Teclee 1 para aceptar, 2 para rechazar.");

                        if (continuar ==2)
                        {System.out.println("Operación cancelada a petición suya.");break;}

                        cuenta1.retirar(importe);
                    }
                    while (continuar<1 || continuar > 2);
                }
                
                saldo = cuenta1.getSaldo();
                System.out.println("El saldo de tu cuenta es: "+saldo+"€");
            }break;
            case 3: break;
            case 4: break;
            case 5: stop=5;break;
        }
       importe=0; 
      }
      while(stop!=5);
      System.out.println("Gracias por confiar en nosotros");
} //fin main     
} //fin clase