package ejercicios;
import java.util.Scanner;
public class Circulo { 
 
    double radio, diametro, area, perimetro;

    Circulo() {}

public double setRadio(double r){
    return this.radio=r;
        
}
double getRadio(){
        return this.radio;
}
public double calcularPerímetro (){
   return this.perimetro = 2 * (Math.PI)* (getRadio());
}
public double calcularSuperficie (){
   return this.area= Math.PI * (getRadio()*getRadio());
}
public double calcularDiametro  (){
   return this.diametro = (double) ((getRadio())*2);
}
} //fin clase
