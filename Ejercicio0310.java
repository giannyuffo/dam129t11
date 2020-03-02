
package ejercicios;
import java.util.Scanner;
public class Ejercicio0310 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
                
         int edad=18;
         boolean menoredad=false;
      
         while (edad!=-1)
                {   if (edad <-1 || edad> 150)  
                      {System.out.println("Edades erróneas");break;}
                    else
                    {
                        System.out.println("Introduce una edad");
                        edad=teclado.nextInt();
                        if (edad > -1 && edad<18 )
                            menoredad=true;
                    }
                
                } 
            
                
        {if (menoredad!=true)
           System.out.println("No hay ningún menor de edad");
           // 
             
        else  
            System.out.println("Hay algún menor de edad");}

                
              
     }}