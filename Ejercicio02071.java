
package ejercicios;
import java.util.Scanner;
public class Ejercicio02071 {
     public static void main(String[] args)  {
         
        int var1, var2, var3;         
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor de las variables 1, 2 y 3");
                     var1 = teclado.nextInt();//1
                     var2 = teclado.nextInt();//2    
                     var3 = teclado.nextInt();//3
                      
         if (var1 >= var2 && var1>= var3)
             //1> > >
                    {if (var2 >= var3) 
                        //1>2>3
                        System.out.println(var1 + ">=" + var2 + ">=" + var3);
                    else 
                        //1>3>2
                        System.out.println(var1 + ">=" + var3 + ">=" + var2);
                    }
         
         else 
             // > 1? >1?
             
            {if (var2>=var3)
                    //2> > >
                        { if (var3>=var1)
                            //2>3>1
                             System.out.println(var2 + ">=" + var3 + ">=" + var1);
                        else 
                            // 2>1>3
                            System.out.println(var2 + ">=" + var1 + ">=" + var3);
                        }  
            else 
                    
                    {if (var3>=var2 && var3>var1)
                        //3>2>1
                        System.out.println(var3 + ">=" + var2 + ">=" + var1);
                    else 
                        System.out.println(var3 + ">=" + var1 + ">=" + var2);
                        
                    
                
                    } 
                    
            }       
                    
         
         
         }}
