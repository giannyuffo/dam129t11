package ejercicios;
import java.time.*;
import java.time.temporal.*;

public class Ejercicio0613 {
    public static void main(String[] args)  { 
   
   boolean resp;
    Alumno a1 = new Alumno ("pepe perez", "3300000Z", LocalDate.parse("2000-12-31"));
        Alumno a2 = new Alumno ("ana lopez",  "3200000A", LocalDate.parse("2010-12-31"));
        Alumno a3 = new Alumno ("luis ares",  "3100000B", LocalDate.parse("1999-01-01"));
        Alumno a4 = new Alumno ("pepe perez", "3300000Z", LocalDate.parse("2000-12-31"));
        
        resp = a1.MayorEdad();
        if (resp) System.out.println (a1.getName()+ " es mayor de edad.");
        else      System.out.println (a1.getName()+ " no es mayor de edad.");
        
        if (!a2.MayorEdad()) System.out.println (a2.getName()+ " no es mayor de edad.");
        else                   System.out.println (a2.getName()+ " es mayor de edad.");
        
        resp = a1.MayorQueOtro (a2);
        if (resp) System.out.println (a1.getName()+ " es mayor que "+a2.getName());
        else      System.out.println (a1.getName()+ " no es mayor que "+a2.getName());
        
        resp = a1.Iguales (a2);
        if (resp) System.out.println (a1.getName()+ " es idÃ©ntico a "+a2.getName());
        else      System.out.println (a1.getName()+ " no es idÃ©ntico a "+a2.getName());
        
        resp = a1.Iguales (a4);
        if (resp) System.out.println (a1.getName()+ " es idÃ©ntico a "+a4.getName());
        else      System.out.println (a1.getName()+ " no es idÃ©ntico a "+a4.getName());
}//fin main
}//fin clase
