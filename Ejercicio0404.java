package ejercicios; 
public class Ejercicio0404 {    
public static void main(String[] args) {
    
        int ant=1, ant2=0, num;        
        for (int i=1; i<=12; i++)
        {
            
            num = ant + ant2;             
            System.out.println(num);            
             ant2 = ant;
             ant = num;      
        }
        
 
} //fin main     
} //fin clase