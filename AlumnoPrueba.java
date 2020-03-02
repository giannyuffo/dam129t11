package ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Scanner;

/**
 *
 * @author uffog
 */
public class AlumnoPrueba {
    String centro, nombre, dni;
    LocalDate fechaNac;
    int contador=1;
    Scanner teclado = new Scanner(System.in);
     int dia, mes, año;
     
      @Override
    public String toString() {
        int i=1;i++;
        return "Alumno i {"+ i + "centro=" + centro + ", nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", contador=" + contador + '}';
    }
    
    public Alumno() {
    
    }
     //public Alumno(int c) {
   
        //contador=c;
        //AlumnoString(contador);
        
    //}
    public void setCentro(String d){
        final String centro = d;
        this.centro.toUpperCase();
    }
    public void setNombreAlumno(String n){
        nombre = n;
        this.nombre.toUpperCase();
    }
    public void setDNI (String d){
        dni=d;
        this.dni.toUpperCase();
    }
    public  void setFechaNacimiento(){
        
        System.out.println("Introduce el día, mes y año de nacimiento");
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        año=teclado.nextInt();

        this.fechaNac=LocalDate.of(año,mes,dia);
    }

    public String getCentro() {
        return centro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void MayorEdad(){
        LocalDate fecha=getFechaNac();
        LocalDate hoy =LocalDate.now();
            
        int years=(int) fecha.until(hoy,ChronoUnit.YEARS);
    
        if(years<18)
        {System.out.println("Es menor de edad");}
        else
            System.out.println("Es mayor de edad");
    }
    
   

  
}
