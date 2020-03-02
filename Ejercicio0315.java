
package ejercicios;
public class Ejercicio0315 {
        public static void main(String[] args)  {         
            
            int hora=0;                     
            for (int i=1;i<=7*24;i++) 
                {             
                System.out.println (hora);             
                if (++hora > 23) hora=0;        
                }        
} //fin main     
} //fin clase
//EL EJERCICIO INTENTA PONER LAS HORAS, SIN LOS MINUTOS, DE 7 DIAS