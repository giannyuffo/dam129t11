
package ejercicios;
public class Ejercicio0318 {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args)  {
     
         int i, j,multi;
         
         for(i=1; i<10; i++)
         {multi=0;
             for(j=0; j<11; j++)
             {
              multi=i*j;
              System.out.println(i+" x "+j+"="+multi);
             }
             System.out.println();
         }
} //fin main     
} //fin clase