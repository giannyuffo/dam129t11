package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class Sistemas {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner teclado = new Scanner(System.in);
        for (long i=0;i<99999;i++){
        notePad();
       
        calc();
       
      
      
        }

        

    }
 public static void notePad () throws IOException, InterruptedException {
        var processBuilder = new ProcessBuilder();

        processBuilder.command("notepad.exe");

        var process = processBuilder.start();

     
 }
 public static void calc () throws IOException, InterruptedException {
     var processBuilder = new ProcessBuilder();

        processBuilder.command("calc.exe");

        var process = processBuilder.start();

        //var ret = process.waitFor();
     
 }
    }