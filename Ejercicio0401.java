
package ejercicios;
import java.util.Scanner;
public class Ejercicio0401 {
     
     public static void main(String[] args)  {
     
         Scanner teclado = new Scanner(System.in);
        long dni = 0;
        int resto;
       
        
         while(String.valueOf(dni).length()!=8){
            System.out.println("Introduce el número del DNI");
            dni=teclado.nextInt();
         }
         
          resto= (int) (dni%23);String letter = null;
          
          switch(resto){
              case 0:letter="T";break;
              case 1:letter="R";break;
              case 2:letter="W";break;
              case 3:letter="A";break;
              case 4:letter="G";break;
              case 5:letter="M";break;
              case 6:letter="Y";break;
              case 7:letter="F";break;
              case 8:letter="P";break;
              case 9:letter="D";break;
              case 10:letter="X";break;
              case 11:letter="B";break;
              case 12:letter="N";break;
              case 13:letter="J";break;
              case 14:letter="Z";break;
              case 15:letter="S";break;
              case 16:letter="Q";break;
              case 17:letter="V";break;
              case 18:letter="H";break;
              case 19:letter="L";break;
              case 20:letter="C";break;
              case 21:letter="K";break;
              case 22:letter="E";break;
          }
          System.out.printf("El número DNI con letra es:%d%s.\n", dni,letter);
} //fin main     
} //fin clase