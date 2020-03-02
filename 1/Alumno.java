package ejercicios;
import java.time.*;
import java.time.temporal.*;
public class Alumno {
    private String name;
    private String DNI;
    private LocalDate fecNac;
    public static String nomEscuela="IES Fernando Wirtz";
    
public Alumno(String NomAl, String DNI, LocalDate fecNac){
    name = NomAl;
    this.DNI = DNI;
    this.fecNac = fecNac;
}
     
    public void setName(String n){
    name = n;
}

public String getName(){
    return name;
}

public void setDni(String dni) {
    DNI = dni;
}

public String getDni() {
    return DNI;
}

public void setFecha(LocalDate fechaNac){
    fecNac = fechaNac;
}

public LocalDate getFecha(){
    return fecNac;
}

public boolean MayorEdad(){
  LocalDate FecActual = LocalDate.now();
         long Years;
    if (( Years = fecNac.until(FecActual , ChronoUnit.YEARS)) >= 18){
        return true;
    }
    else return false;
}

public boolean MayorQueOtro(Alumno otro){
     long anhosMayor = ChronoUnit.DAYS.between(this.fecNac, otro.fecNac);
   if(anhosMayor>0) return true;
   return false;
}

public boolean Iguales(Alumno otro){
   if (!this.name.equals(otro.name)) return false;
       if (!this.DNI.equals(otro.DNI)) return false;
       long edad = ChronoUnit.DAYS.between(this.fecNac,otro.fecNac);
       if (edad != 0) return false;
       return true;
            
}

//para el de saber si son iguales también se le pasa como parámetro el objeto entero
}//fin clase
