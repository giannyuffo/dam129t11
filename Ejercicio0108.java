package ejercicios;
import java.util.Scanner;
public class Ejercicio0108 {
    public static void main(String[] args)  {
        
        double pvp, gan, imp, pfabric;
        //venta al publico, ganancias, impuestos y precio de fabricacion.
       // P.F.V
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("p.f.v. ");
        pfabric = teclado.nextDouble();
        gan = 0.06; imp = 0.12;
        pvp = pfabric + pfabric * imp + pfabric * gan;
        
        System.out.println("p.v.p. " + pvp);
    }
}
