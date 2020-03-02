
package ejercicios;
import java.util.Scanner;
public class Ejercicio0605 {
   
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
       
        /* el juego funciona solamente con los que introduce el usuario, 
        no soy capaz de interpretar los numeros que saca la máquina.
        */
        Nim juego =new Nim();
        Consola pintar=new Consola();
        
        int [] caja=new int [2];
        
        int fila=0, palillos=0,maquina,palillosMaq,filaMaq;
        boolean fin;
        System.out.println("¿Quieres empezar tú o la máquina?(1-tu, 2-máq.)");
        
        
        int seleccion=teclado.nextInt();
        
       if(seleccion!=1 && seleccion!=2)
       {
            do{
                System.out.println("Introduce una opción correcta. (1-tu, 2-máq.)\n\n");
                seleccion=teclado.nextInt();
            }
            while(seleccion!=1||seleccion!=2);
       }
       if(seleccion==1)
        {
            for (int i=0; i<juego.palillos.length; i++)
                     {System.out.printf("%d ", juego.palillos [i]);}
            
            do{
                System.out.println("\n¿De qué fila quieres quitar palillos?");
                fila=teclado.nextInt();
                System.out.println("¿Cuántos palillos quieres quitar?");
                palillos=teclado.nextInt();
                
                juego.Juega(fila, palillos);
                
                for (int i=0; i<juego.palillos.length; i++)
                     {System.out.printf("%d ", juego.palillos [i]);}

                System.out.println();
               
                 maquina=juego.Piensa();
                 palillosMaq = maquina%10;
                 filaMaq=maquina/10;
                 juego.Juega(filaMaq, palillosMaq);
                 
                 for (int i=0; i<juego.palillos.length; i++)
                     {System.out.printf("%d ", juego.palillos [i]);}
                 System.out.println("\n");
                 fin=juego.Fin();
                }
            while(fin==false);
        }
        else
        {
            do{
                    //System.out.println(fin);
                   for (int i=0; i<juego.palillos.length; i++)
                        {System.out.printf("%d ", juego.palillos [i]);}
                    System.out.println("\n");

                    maquina=juego.Piensa();
                    palillosMaq = maquina%10;
                    filaMaq=maquina/10;
                    juego.Juega(filaMaq, palillosMaq);
                    fin=juego.Fin();
                    // System.out.println(fin);
                   for (int i=0; i<juego.palillos.length; i++)
                       {System.out.printf("%d", juego.palillos [i]);}

                   if(fin!=true){
                       System.out.println("\n¿De qué fila quieres quitar palillos?");
                       fila=teclado.nextInt();
                       System.out.println("¿Cuántos palillos quieres quitar?\n");
                       palillos=teclado.nextInt();

                       juego.Juega(fila, palillos);
                       fin=juego.Fin();
                   }
                   else
                   {break;}
                        
                }
                while(fin==false);
        }
} //fin main  
} //fin clase