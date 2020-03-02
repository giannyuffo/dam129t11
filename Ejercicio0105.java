package ejercicios;
import java.util.Scanner;
public class Ejercicio0105 {
    public static void main(String[] args)  {
        
        int suspensos, suficientes, notables, sobresalientes, alumnos;
        double porcAprobados, porcNotSobre;
        
    
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("¿Cuántos alumnos son?");
        alumnos = teclado.nextInt();
       
        System.out.println("Ahora, ¿Cuántos suspensos hay?");
        suspensos = teclado.nextInt();
        
        System.out.println("¿Suficientes?");
        suficientes = teclado.nextInt();
        
        System.out.println("¿Y notables?");
        notables = teclado.nextInt();
        
        System.out.println("Por último, ¿Hay algún sobresaliente?");
        sobresalientes = teclado.nextInt();
        
        if ( suspensos + suficientes + notables + sobresalientes == alumnos) {
            porcAprobados = (suficientes + notables + sobresalientes)*100/alumnos;
        porcNotSobre = (notables + sobresalientes)*100/alumnos;
        
        System.out.println ("Hay un " + porcAprobados + "% de aprobados");
        System.out.println("y un " + porcNotSobre + " % de Notables y Sobresalientes");
        }        
        else System.out.println("Introduce los datos correctamente, el número de alumnos es erróneo");
        
        
        
        
        
    }
}