
package ejercicios;
import java.time.*;
import static java.time.Duration.between;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
/*
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
import java.util.Scanner;
public class Ejercicio0611 {

    public static void main(String[] args)  {
        
       Scanner teclado = new Scanner(System.in);

       LocalDate ahora = LocalDate.now();
        
       int opcion; 
        do{
            System.out.println("Opción 1: Dias desde Cumpleaños \n"
                + "Opción 2: Fecha con suma de días \n"
                + "Opción 3: Diferencia entre horas del reloj \n"
                + "Opción 4: Años Biciestos \n"
                + "Opción 5: Día de la semana de una fecha \n"
                + "Opción 6: Devoluciones \n"
                + "Opción 7: Domingos en año \n"
                    + "Opción 8: fin");
         opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                {System.out.printf("Han transurrido un total de %d. \n",DiasDesdeCumple(ahora));break;}
                case 2:   
                {System.out.println("Será: "+ FechaSumaDias()+".\n");break;}
                case 3:
                {System.out.printf("Han transucrrido %d segundos. \n",HorasReloj()); break;}
                case 4:
                {System.out.printf("Han transcurrido: %d años biciestos. \n",AñoBiciesto());break;}
                case 5:
                {System.out.printf("El día introducido es: %s .\n", NombreDiaSemana());break;}
                case 6:
                {Devoluciones();break;}
                case 7:
                {
                    System.out.println("Introduce un año.");
                    int year=teclado.nextInt();
                    System.out.printf("El año %d tiene %d Domingos. \n",year,NumeroDomingos(year));break;}
                 case 8:
                {break;}
            }//fin switch
        }
        while(opcion!=8);
} //fin main  
private static int DiasDesdeCumple(LocalDate a){
   
    LocalDate ahora=a;
    Scanner teclado = new Scanner(System.in);
    int diasTranscurridos;
    
    System.out.println("Introduce el día, mes y año del último cumpleaños");
    int dia=teclado.nextInt();
    int mes=teclado.nextInt();
    int año=teclado.nextInt();

    LocalDate cumple=LocalDate.of(año,mes,dia);

    return diasTranscurridos = (int) cumple.until(ahora,ChronoUnit.DAYS);
}      
private static LocalDate FechaSumaDias(){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce el día, mes y año de la fecha que quieras");
    int dia=teclado.nextInt();
    int mes=teclado.nextInt();
    int año=teclado.nextInt();
    
    LocalDate fecha=LocalDate.of(año,mes,dia);
     
    System.out.println("Introduce los días a sumar");
    int diasSuma=teclado.nextInt();
    
    return fecha.plus(diasSuma,DAYS);
    }
private static int HorasReloj(){
    Scanner teclado = new Scanner(System.in);
    int segundosTranscurridos;
     
    System.out.println("Introduce horas, minutos y segundos de la primera hora");
    int h1=teclado.nextInt();
        if(ValidadorHoras(h1)==false)
        {
            do{
                System.out.println("Vuelve a introducir las horas");
                h1=teclado.nextInt();
            }
            while(ValidadorHoras(h1)==false);
        }
    int m1=teclado.nextInt();
        if(ValidadorMins(m1)==false)
        {
            do{
                System.out.println("Vuelve a introducir los minutos");
                m1=teclado.nextInt();
            }
            while(ValidadorMins(m1)==false);
        }
    int s1=teclado.nextInt();
         if(ValidadorSeg(s1)==false)
        {
            do{
                System.out.println("Vuelve a introducir los minutos");
                s1=teclado.nextInt();
            }
            while(ValidadorSeg(s1)==false);
        }
    LocalTime hora1 = LocalTime.of (h1,m1,s1);

    System.out.println("Introduce horas, minutos y segundos de la segunda hora");
   
    int h2=teclado.nextInt();
        if(ValidadorHoras(h2)==false)
        {
            do{
                System.out.println("Vuelve a introducir las horas");
                h2=teclado.nextInt();
            }
            while(ValidadorHoras(h2)==false);
        }
    int m2=teclado.nextInt();
        if(ValidadorMins(m2)==false)
        {
            do{
                System.out.println("Vuelve a introducir los minutos");
                m2=teclado.nextInt();
            }
            while(ValidadorMins(m2)==false);
        }
    int s2=teclado.nextInt();
         if(ValidadorSeg(s2)==false)
        {
            do{
                System.out.println("Vuelve a introducir los minutos");
                s2=teclado.nextInt();
            }
            while(ValidadorSeg(s2)==false);
        }
    LocalTime hora2 = LocalTime.of (h2,m2,s2);
    
    return segundosTranscurridos = (int) hora1.until(hora2,ChronoUnit.SECONDS); 
        }
private static boolean ValidadorHoras(int h){
    int horas=h;
    if(horas<0 || horas>24)
    {
        System.out.println("Horas erróneas. Introduce un número entre 0 y 24");
        return false;
    }
    else 
    {
    return true;
    }
}
private static boolean ValidadorMins(int m){
    
    int mins=m;
    if(mins<0 || mins>59)
    {
        System.out.println("MInutos erróneas. Introduce un número entre 0 y 59");
        return false;
    }
    else 
    {
    return true;
    }
}
private static boolean ValidadorSeg(int s){

    int seg=s;
    if(seg<0 || seg>59)
    {
        System.out.println("Segundos erróneas. Introduce un número entre 0 y 59");
        return false;
    }
    else 
    {
    return true;
    }
}
private static int AñoBiciesto(){
    int contador=0;
    
    for (int i = 1; i < 2021; i++) {
       LocalDate year =LocalDate.of(i,1,1);
       if(year.isLeapYear ())
       {
       contador ++;
       }
    }
    return contador;
}
private static int DiaSemana(){
    String name;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce una fecha (dd-mm-yyyy)");
    int dia=teclado.nextInt();
    int mes=teclado.nextInt();
    int año=teclado.nextInt();

    LocalDate cumple=LocalDate.of(año,mes,dia);

    return cumple.getDayOfWeek().getValue();
}
private static String NombreDiaSemana(){
    String nombre = null;
    int dia=DiaSemana();
    
   
    
    switch (dia) {
        case 1: {nombre = "Lunes"; break;}
        case 2: {nombre = "Martes"; break;}
        case 3: {nombre = "Miércoles"; break;}
        case 4: {nombre = "Jueves"; break;}
        case 5: {nombre = "Viernes"; break;}
        case 6: {nombre = "Sábado"; break;}
        case 7: {nombre = "Domingo"; break;}
    }
    return nombre;
}
public static int NumeroDomingos(int y){
    
    int year=y, contador=0;
    for (int i = 1; i < 13; i++) {
        
        for (int j = 1; j <NumeroDiasMes(i,year) ; j++) {
             
           LocalDate domingos=LocalDate.of(year,i,j);
           
           if(domingos.getDayOfWeek().getValue()==7)
           {
               contador++;
           }
        }
    }
    return contador;
}
public static int NumeroDiasMes(int m, int y){

    int month=m,year=y;
    int daysmonth=0;
    
            switch (month)
            {
                    case 1: daysmonth=31;break;
                    case 2: if ((year%4 == 0) && (year%100>0) || (year%400 == 0))
                                    daysmonth=29;
                            else	
                            daysmonth=28; break;
                    case 3:daysmonth=31;break;
                    case 4:daysmonth=30;break;
                    case 5:daysmonth=31;break;
                    case 6:daysmonth=30;break;
                    case 7:daysmonth=31;break;
                    case 8:daysmonth=31; break;
                    case 9:daysmonth=30;break;
                    case 10:daysmonth=31; break;
                    case 11:daysmonth=30; break;
                    case 12:daysmonth=31; break;
            }
    return daysmonth;
}
public static void Devoluciones(){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce el día, mes y año de la compra del producto");
    int dia=teclado.nextInt();
    int mes=teclado.nextInt();
    int año=teclado.nextInt();
    
    LocalDate fecha=LocalDate.of(año,mes,dia);
    
    Productos(fecha);   
}
public static void Productos(LocalDate f){
   Scanner teclado = new Scanner(System.in);
   LocalDate fechaCompra= f;
   LocalDate hoy =LocalDate.now();
   int diasTranscurridos;
   
   System.out.println("¿Qúe tipo de producto quieres devolver?\n"
            + "1- Perecederos\n"
            + "2- Electrónica\n"
            + "3- Ropa\n");
    int opcion=teclado.nextInt();
    switch (opcion) {
        case 1: 
        {if ((diasTranscurridos = (int) fechaCompra.until(hoy,ChronoUnit.HOURS))<6)
            {
                System.out.println("Se puede devolver el producto Perecedero");
            }
            else System.out.printf("No se puede devolver el producto Perecedero porque han pasado %d horas",diasTranscurridos);
            break;}
        case 2:  {if ((diasTranscurridos = (int) fechaCompra.until(hoy,ChronoUnit.MONTHS))<7)
            {
                System.out.println("Se puede devolver el producto de Electrónica");
            }
            else System.out.printf("No se puede devolver el producto de Electrónica porque han pasado %d meses", diasTranscurridos);
            break;}
        case 3:  {if ((diasTranscurridos = (int) fechaCompra.until(hoy,ChronoUnit.DAYS))<16)
            {
                System.out.println("Se puede devolver el producto Textil");
            }
            else System.out.printf("No se puede devolver el producto Textil porque han pasado %d días",diasTranscurridos);
            break;}
    }
}
} //fin clase