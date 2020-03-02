
package ejercicios;
import java.util.Scanner;
public class Ejercicio0316 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
            
        int num1=0, num2=0, nveces=2;
        boolean acertar=false;
        
        System.out.println("Comienza el primer jugador. Introduce un número entre 0 y 100");
            num1=teclado.nextInt();
            if (num1<0 || num1>100)
                {do{
                    System.out.println("Número erróneo, vuelve a introducirlo");
                    num1=teclado.nextInt();
                    }
                while(num1<0 || num1>100);
                } 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Segundo jugador. Intenta adivinar el número.Introduce un número entre 0 y 100. Tienes 5 intentos.");
            num2=teclado.nextInt();
        do { 
             if (num2<0 || num2>100)
                 {do{
                     System.out.println("Número erróneo, vuelve a introducirlo");
                     num2=teclado.nextInt();
                     }

                 while(num2<0 || num2>100);
                 }
             else 
              {
                if(num1 != num2) 
                    {   

                        if (num1>num2)
                            System.out.println("Tu número es más pequeño");
                        if (num1<num2)
                            System.out.println("Tu número es más grande");
                        acertar =false;
                        System.out.println("Vuelve a intentarlo");
                            num2=teclado.nextInt(); 

                        nveces++;
                    }  
                if(num1==num2) 
                    {
                        acertar=true;  
                    }    
              }
            }
       while (acertar == false && nveces<6);
       if(num1 != num2)
            System.out.println("No haz acertado. Esperemos que tengas más suerte mañana.");
                 
       else 
            System.out.println("Haz acertado. Toma, un premio.");
} //fin main     
} //fin clase