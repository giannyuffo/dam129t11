package ejercicios;
import java.util.Scanner;
public class Ejercicio011101 {
    public static void main(String[] args)  {
       
 
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        double media;
        
        System.out.println("Introduce la primera edad");
        edad = teclado.nextInt();
        
        if (edad > -1 & edad < 130)
                
                {System.out.println("Introduce la segunda edad");
                 edad = edad + teclado.nextInt();
                    
                 if (edad > -1 & edad < 130)
                    
                        {System.out.println("Introduce la tercera edad");
                        edad = edad + teclado.nextInt();
                        
                           if (edad > -1 & edad < 130)
                            {System.out.println("Introduce la cuarta edad");
                             edad = edad + teclado.nextInt();
                            
                                    if (edad > -1 & edad < 130)
                                        {
                                            media = edad/4;
                                            System.out.println("La media es: " + media);
                                        
                                        }
                                    else System.out.println("Edades erróneas");
                            }
                           else System.out.println("Edades erróneas");
                        }
                 else System.out.println("Edades erróneas");
                }
        else System.out.println("Edades erróneas");
        
        
}}