package ejercicios; 
import java.util.Scanner;
public class Ejercicio0406 {    
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
        System.out.println("Introduce el sueldo base");
        int sueldoBase=teclado.nextInt();
        System.out.println("Introduce las horas extras");
        int horasExtras=teclado.nextInt();
        System.out.println("Introduce el número de ventas");
        int ventas=teclado.nextInt();
        
        System.out.println(sueldoNeto(horasExtras,ventas,sueldoBase));
} //fin main
static int sueldoNeto(int h, int p, int s){

    int horasExtras,plus, sueldoBase, total;
    
    horasExtras=horasExtras(h);
    plus=cantidadVentas(p);
    sueldoBase=sueldoBase(s);
    
    total=horasExtras+plus+sueldoBase;
    return total;
}
static int sueldoBase(int s){
    
    int sueldo;
    return sueldo=s;
}
static int horasExtras(int h){
    int horasExtras;
    return  horasExtras = h *100;
}
static int cantidadVentas(int p){

    int cantidadVentas, plus=0;
    cantidadVentas=p;
    
    if(cantidadVentas>9 && cantidadVentas<21)
        plus=500;
    if(cantidadVentas>20 && cantidadVentas<31)
        plus=1000;
    if(cantidadVentas>30)
        plus=1300;
    return plus;
}
} //fin clase