
package ejercicios;
import java.util.Scanner;
public class Ejercicio0312 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);
       
        int totaldenotas=0, aprobados=0;
        double notaexamen, min=10, max=0, suma=0, media, porcentaje=0;
        boolean cinco=false;
       
        do {
             System.out.println("Introduce una nota");
             notaexamen=teclado.nextDouble();

             if (notaexamen < -1 || notaexamen >11)
               System.out.println("La nota que has introducido es errónea."); 

             if (notaexamen==5)
               cinco=true;
             if (notaexamen>-1 && notaexamen<min && notaexamen < 11)
                min=notaexamen;
             if( notaexamen>-1 && notaexamen>max && notaexamen < 11)
                max=notaexamen;
             if(notaexamen>4 && notaexamen < 11)
               aprobados++;
             if (notaexamen > -1 && notaexamen<11)
                     totaldenotas++;
             if (notaexamen > -1 && notaexamen<11)
                     suma= notaexamen+suma;
        }
        while(-1 != notaexamen);

        media = (double)(suma / totaldenotas);
        porcentaje=(double)(aprobados*100/totaldenotas);

        System.out.println("Se han introducido: " + totaldenotas +" notas.");
        System.out.println("La nota mínima es: "+ min +" y la nota máxima es: " + max);
        System.out.println("La media es: "+ media );
        {if (cinco!=true)
             System.out.println("No hay ninguna nota igual a 5");
        else System.out.println("Hay alguna nota igual a 5");}
        System.out.println("El porcentaje de aprobados es: "+ porcentaje +"%");
}}