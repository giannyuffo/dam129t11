package ejercicios; 
import java.util.Scanner;
public class Ejercicio0414 {    
/*22
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
public static void main(String[] args) {

       int n1,n2,n3,n4,n5,n6,n7, suma = 0;
       
       //for (int j = 1; j < 10001; j++) {
       // resultado=0;
    
      for (int i = 3; i < 10003; i++) {
       
          n1=i;
          if(n1%3==0)
          {
              System.out.println(n1);
        //for(int j=1;j<7; j++) {
           n2=n1%10;
           n3=n1%100;
           n4=n1%1000;
           
          suma=n2+n3+n4; 
        //   if(suma%3==0)
            System.out.println(suma);
          }
      //  }//fin for
       n1=0;       n1=0;

        suma=0;
       }//fin for
        
}
}