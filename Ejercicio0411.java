package ejercicios; 
import java.util.Scanner;
public class Ejercicio0411 {    
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
    String sexo;String s;
    int contador=0, edad;
    
    do{
    System.out.println("Introduce el sexo (H o M).");
    sexo=teclado.next();
    s=sexo.toUpperCase();
    System.out.println(s);
    contador++;
        do{
            System.out.println("Introduce la edad.");
            edad=teclado.nextInt();   
        }
        while(edad!=0 && edad<16 || edad>71);
        
    menor(edad, s);
    }
    while(contador == 30 || edad==0);
}
public static boolean menor( int e, String H){
    String devolver;
    String sexo=H;
    int edad=e, menor=99, mayor=0;
   
    if (edad<=menor)
    {
    menor=edad;
    devolver=
    }
}
public static 
}//fin clase