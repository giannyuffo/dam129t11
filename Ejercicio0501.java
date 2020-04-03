
package ejercicios;
import java.util.Scanner;
/*

 * @author uffog
 * 
 * Ctrl + Space                 completar
   Alt + Insert                 varias opciones
   Ctrl + R                     refactorizar
   fcom + Tab                   comentarios
   fori + Tab                      for
   sout + Tab o soutv + Tab   ...pintln...
   iff + Tab                       if
   sw + Tab                      switch
 * 
*/

public class Ejercicio0501 {
     public static void main(String[] args)  {
         
        Scanner teclado = new Scanner(System.in);     
        String cad = new String();
       
        int accountant = 0, IntegerNumber = 0;
        char b,subCad1,subCad2 = 0, subCad3;
        boolean palindrome=false, character=false, stop=false;
        
        
       // do{
            System.out.println("Write the phrase that you want to work with.");
            cad=teclado.nextLine();
            
            System.out.println("Select an option: "
                + "a: Capital and lowercase letters\n"
                + "b: How many numbers there are. \n"
                + "c: Is it a palindrome sentence?\n"
                + "d: Convert the String into an Integer number.\n"
                + "e: Convert the String into an Hexadecimal number.\n"
                + "f: Create a String with the first and last position excahange.\n"
                + "g: Exit.");
            b=teclado.next().charAt(0);
            
            switch (b) {
                 case 'a':{
                    String minus = cad.toLowerCase();
                    String capital = cad.toUpperCase();
                    System.out.printf("The lowercase sentence is: %s. On capital letter is %s.\n",minus,capital);
                 }break;
                 case 'b':{
                     for (int i = 0; i < cad.length(); i++) {
                         subCad3=cad.charAt(i);
                         character = Character.isDigit(subCad3);

                         if(character == true)
                         {accountant++;}
                     }
                     System.out.printf("There are %d numbers on the String.", accountant);
                 }break;
                 case 'c':{

                     for (int i = 0; i < cad.length(); i++) {
                        subCad1 = cad.charAt(i);
                        for (int j = cad.length()-1; j>=0; j--) {
                         subCad2 = cad.charAt(j);
                        }
                        String a=Character.toString(subCad1);
                        String c=Character.toString(subCad2);

                        if(a.equals(c)==true)
                         palindrome=true;
                        else
                            palindrome=false;
                     }
                     if(palindrome==true)
                         System.out.println("It's a palindrome String.");
                     else 
                         System.out.println("It isn't a palindrome String.");
                 }break;
                 case 'd':{
                     String subCad4,subCad5, subCad6,subCad7;  
                     
                     subCad4 = cad.toLowerCase();
                     subCad5 = subCad4.replaceAll("[a-z]","");
                     subCad6=subCad5.replaceAll(" ","");
                     subCad7=subCad6.trim();
                     
                     IntegerNumber = Integer.parseInt(subCad6);
                     
                     System.out.println("The Integer number is : " + IntegerNumber);
               
                 }break;  
                 case 'e':{

                   //  String Hexa=Integer.toHexString(IntegerNumber);
                     //System.out.println(""+ Hexa);
                     
                      String Hex="";
                     
                     for (int i = 0; i < cad.length(); i++) {
                         
                         char ch=cad.charAt(i);
                         int in = (int)ch;
                         
                         String part = Integer.toHexString(in);
                         
                         Hex +=part;
                     }
                     System.out.println(Hex);
                     
                     
                     //se obtiene un numero alternaativo muy raro. 
                     
                 }break;
                 case 'f':{

                     StringBuilder sb = new StringBuilder();
                     
                     sb.append(cad);
                     char uno,ultimo;
                     int longitud= cad.length();
                     
                     uno=cad.charAt(0);
                     ultimo=cad.charAt(longitud);
                     
                     sb.setCharAt(longitud, uno);
                     sb.setCharAt(0,ultimo);
                     System.out.println(sb);
                    
                     
                     //da error
                 }break;
                 case 'g':{stop=true;}
                 default: System.out.println("Opción no válida.");
             }
        //}
        //while(stop!=true);
} //fin main     
} //fin clase