
package ejercicios;
import java.util.Scanner;
public class Ejercicio0402 {
     
     public static void main(String[] args)  {
     
         Scanner teclado = new Scanner(System.in);
       
         int valor1, valor2=0;
        
         
         System.out.println("Introduce números ordenados. 0 para finalizar");
         boolean asc=true, ordenado=true;
         
         valor1 =teclado.nextInt();
         //do{
             
                 while(asc==true&& ordenado==true);
                 {
                    valor2 =teclado.nextInt();
                     //if(valor1==0 || valor2==0)
                        //{break;}
                     
                    if (valor1<valor2 && valor1!=0 || valor2!=0)
                      {
                          System.out.println("Están ordenados ascendentemente");
                         
                          asc=true;
                       }
                    else
                    {asc=false;
                    ordenado=false;} 
                    valor1=valor2; 
                 }
                 
                 while(asc!=true && ordenado==true);
                 {
                     valor2 =teclado.nextInt(); 
                     //if(valor1==0 || valor2==0)
                        //{break;}
                     
                     if (valor1>valor2 && valor1!=0 || valor2!=0)
                     {
                        System.out.println("Están ordenados descendentemente");
                        
                     }
                     else
                     {asc=true;
                     ordenado=false;}
                     valor1=valor2;
                 }
        // }
        // while(valor1!=0 || valor2!=0);
} //fin main     
} //fin clase