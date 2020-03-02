package ejercicios; 
import java.util.Scanner;
public class Ejercicio0405 {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
        
 int areaCirc, areaCua, areaTri;
 boolean Circ=false,Cua=false,Tri=false, stop=false;
 
do{ 
System.out.println("Elige de qué figura vas a calcular el área."
         + "\nCírculo:1 \nCuadrado:2 \nTriángulo:3 \n4 para finalizar.");
int caso=teclado.nextInt();
 switch (caso){
     case 1: Circ=true;break;
     case 2: Cua=true;break;
     case 3: Tri=true;break;
     case 4: stop=true;break;
 }
 
 if(Circ==true)
 {
     System.out.println("Introduce un radio.");
     int radio=teclado.nextInt();
     long area= (long) (Math.PI)* radio * radio;
     System.out.printf("El área es de: %d unidades cuadradas.", area);
 }
 if(Cua==true)
 {
    System.out.println("Introduce un lado.");
    int lado=teclado.nextInt();
    long area= (long) lado*lado*lado*lado;
    System.out.printf("El área es de: %d unidades cuadradas.", area);
 }
 if(Tri==true)
 {
     System.out.println("Introduce la base.");
     int base=teclado.nextInt();
     System.out.println("Ahora introduce la altura.");
     int altura=teclado.nextInt();
     long area= (long) (base*altura)/2;
     System.out.printf("El área es de: %d unidades cuadradas.", area);
 }
}
while(stop==false);
 
} //fin main     
} //fin clase