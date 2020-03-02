
package ejercicios;
import java.util.Scanner;
public class Ejercicio0603 {
   
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);   
        String IBAN = null, IBAN2=null;
        int longitud, opcion=0, stop=0, continuar=0, contador=0, SeleccionCuenta;
        boolean descubierto, Cambiocuenta=false;
        float importe, minimoComision,comisionPorc, saldo=0, cuenta; 
      
        do  {
             System.out.println("Introduce el IBAN de tu cuenta. Recuerda: 24 dígitos y distintos a la anterior.");
             IBAN = teclado.next();
        }
        while(IBAN.length()!=24 );
        CuentaCorriente cuenta1 = new CuentaCorriente(IBAN);
        CuentaCorriente cuenta2 = new CuentaCorriente(IBAN2);
        
        
         
        
        
      //Comisiones fijas establecidas para todas las cuentas
      //porcentajeComision = pc;
      //minimoComision = mc;
      cuenta1.setComision(0.01f,0.5f);
 
    //elegir en un menu las opciones que se desean
      do{
        System.out.println("¿Qúe operación desea realizar?"
              + "\n Opción 1: Ingresar dinero. \n Opción 2: Retirar dinero. \n Opción 3: Ver saldo. \n Opción 4: Crear nueva cuenta corriente. \n Opción 5: Finalizar.");
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
                //descubierto=cuenta1.retirar(importe);
               //if (descubierto==false)
                 //   saldo=0;
                
                comisionPorc=cuenta1.getPorcentajeComision();
                minimoComision = cuenta1.getMinimoCosmision();
                
                System.out.println("La operación tiene una comisión de: "+comisionPorc+"% y un coste mínimo de: "+minimoComision
                        + " ¿Quieres continuar? (1-Sí o 2-No)");
                do{
                continuar=teclado.nextInt();
                    if (continuar<1 || continuar > 2)
                        System.out.println("Opción inválida. Teclee 1 para aceptar, 2 para rechazar.");
                    
                    if (continuar ==2)
                    {System.out.println("Operación cancelada a petición suya.");break;}
                    
                    cuenta1.retirar(importe);
                }
                while (continuar<1 || continuar > 2);
                
                saldo = cuenta1.getSaldo();
                System.out.println("El saldo de tu cuenta es: "+saldo+"€");
            }break;
            case 3:{
                saldo = cuenta1.getSaldo();
                System.out.println("El saldo de tu cuenta es: "+saldo+"€");
            }
                break;
            //case 4:{
                
                   // do{
                   //System.out.println("Seleccione cuenta 1 o 2");
                    //SeleccionCuenta=teclado.nextInt();
                      //  if (SeleccionCuenta<1 || SeleccionCuenta > 2)
                        //    System.out.println("Opción inválida. Teclee 1 , 2.");

                       // if (SeleccionCuenta ==2)
                         //   {   do  {
                           //             System.out.println("Introduce el IBAN de tu cuenta 2. Recuerda: 24 dígitos y distintos a la anterior.");
                             //           IBAN2 = teclado.next();
                               //         }
                                //while(IBAN.length()!=24 );
                                //Cambiocuenta=true;
                                //cuenta=cuenta2;
                            //}
                        //else cuenta=cuenta1;
                      
                             
                          //  }
                    //while (SeleccionCuenta<1 || SeleccionCuenta > 2);

                
            //} break;
            case 5: stop=5;break;
        }
       importe=0; 
      }
      while(stop!=5);
      System.out.println("Gracias por confiar en nosotros");
} //fin main
} //fin clase