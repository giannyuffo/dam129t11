
package ejercicios;
import java.util.Scanner;
public class Ejercicio0210 {
     public static void main(String[] args)  {
         
        int  hora, day;
        
        
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el númrero de dia (1-7)");
         day = teclado.nextInt();
         
         if (day > 0 && day < 8)
                    {System.out.println("Introduce la hora(9hrs - 14hrs)");
                    hora = teclado.nextInt();
                        
                        if (hora > 8 && hora < 15)
                            
                            { if (hora == 9 && day == 7)
                                System.out.println("Hay bus");
                              else {if (hora == 10)
                                        System.out.println("Hay bus");
                                    else {
                                        if (hora == 11 && day == 7)
                                            System.out.println("Hay bus");
                                        else {
                                            if (hora == 12 && day == 4 || day == 7)
                                                System.out.println("Hay bus");
                                            else {
                                                if (hora == 13 && day == 3 || day == 7)
                                                    System.out.println("Hay bus");
                                                else {
                                                    if (hora == 14 && day!= 6)
                                                        System.out.println("Hay bus");
                                                    else System.out.println("No hay bus");
                                                    }
                                                  }
                                            }
                                    }
                                
                                 }
                            }
                    
                    
                    else System.out.println("Números erróneos");
                    
                    }
        
         else System.out.println("Números erróneos");
         
         
         
        }
     }
