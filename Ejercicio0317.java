
package ejercicios;
import java.util.Scanner;
public class Ejercicio0317 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
            
        int notaMod, numMod=2;
        boolean fct=true;
        
        System.out.println("Introduce las notas");
        notaMod=teclado.nextInt();
        
        if (notaMod<0 || notaMod>10)
                 {do{
                     System.out.println("Nota errónea. Vuelve a introducirla.");
                        notaMod=teclado.nextInt();
                     }

                 while(notaMod<0 || notaMod>10);
                 }
        else 
        {
            do 
            {
                if (notaMod<5)
                    {fct=false;
                     numMod=10;
                     System.out.println("Nota Suspensa");  
                    }
                else 
                {
                  if (notaMod<0 || notaMod>10)
                 {do{
                     System.out.println("Nota errónea. Vuelve a introducirla.");
                        notaMod=teclado.nextInt();
                     }

                 while(notaMod<0 || notaMod>10);
                 }
                
                if (notaMod>4)
                    {   System.out.println("Nota Aprobada");
                        numMod++;
                        fct=true;
                    }

                if (notaMod<5)
                    {fct=false;
                     numMod=10;
                     System.out.println("Nota Suspensa");  
                    }
                System.out.println("Introduce la siguinte nota");
                        notaMod=teclado.nextInt();
                }
            }
            while (fct=true && numMod!=10);
            
            {if (!(fct = true)) 
                System.out.println("No puede ir a TFC");
            else 
                System.out.println("Puede ir a TFC");}
        }
} //fin main     
} //fin clase