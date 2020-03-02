
package ejercicios;
import java.util.Scanner;
public class Ejercicio0606 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        double radio;
        
       
        
        Circulo figura=new Circulo();
        
        System.out.println("Dime cuántas circunferencias quieres crear");
        int numero=teclado.nextInt();
        
        for(int i=1; i<numero+1;i++){
            
            
            //System.out.println("Introduce el radio de la circunferencia");
            //radio=teclado.nextDouble();
            radio=Math.random()*50;
            figura.setRadio(radio); //con el setRadio privado no funciona el programa. 

            System.out.println("El radio es de: "+figura.getRadio() +" u.");
            System.out.println("El perímetro es de: "+figura.calcularPerímetro()+" u.");
            System.out.println("La superficie es de: "+figura.calcularSuperficie()+" u2.");
            System.out.println("El diametro es de: "+figura.calcularDiametro()+" u.");
            
            System.out.printf("%d de %d\n", i,numero);
        }
} //fin main     
} //fin clase