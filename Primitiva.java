package ejercicios;
class Primitiva { 

    private int numero;
    int[] Primitiva = new  int [6];
    int[] NumJugados = new  int [6];
    int[] PrimitivaSeis = new  int [6];
    
Primitiva(){

    for (int i=0; i<Primitiva.length; i++)
        { 
            Primitiva [i]= NumeroAleatorio(i);
        }
    OrdenarPrimitiva();
}   
private int NumeroAleatorio(int pos){
    
        do
            {
            this.numero = (int) (Math.random()*49 +1);
            }
        while(Repetido(this.numero, pos)==true);
        
        return this.numero;
}
private boolean Repetido(int n, int p){
    boolean repetido=false;
    int num = n;
    
    for (int i=0; i<p; i++)
    {
        if (num == Primitiva [i])
        {
            repetido=true;
            break;
        }
    }
    return repetido;
}
public void MostrarPantallaSorteados(){
    System.out.println("Estos han sido los números premiados: ");
    for (int i=0; i<Primitiva.length; i++)
        System.out.printf("%d ", Primitiva [i]);
    
    System.out.printf("\n\nTienes un total de %d aciertos.",BuscarPremiados());
        if(BuscarPremiados()>0)
            System.out.println("\n¡Felicidades!");
    System.out.println("\nSiga Jugando. Mucha suerte. ");
}
public void NumJugados(int num, int pos){
    
            NumJugados [pos]=num;
}
public void MostrarPantallaJugados(){
    System.out.println("Estos han sido los números jugados: ");
    for (int i=0; i<NumJugados.length; i++)
        System.out.printf("%d ", NumJugados [i]);
}
public void OrdenarPrimitiva(){

    int posMin, num1;
    //busqueda del menor
    for (int i=0; i<Primitiva.length; i++)
    {
        posMin = i;
        
        for (int j=i+1; j<Primitiva.length; j++)
        {
            if (Primitiva[j] < Primitiva[posMin])
            {
                posMin=j;
            }
        }
        int aux = Primitiva[i];
        Primitiva[i]=Primitiva [posMin];
        Primitiva[posMin]=aux;
    }
}
public void OrdenarJugados(){

    int posMin;
    //busqueda del menor
    for (int i=0; i<NumJugados.length; i++)
    {
        posMin = i;
        
        for (int j=i+1; j<NumJugados.length; j++)
        {
            if (NumJugados[j] < NumJugados[posMin])
            {
                posMin=j;
            }
        }
        int aux = NumJugados[i];
        NumJugados[i]=NumJugados [posMin];
        NumJugados[posMin]=aux;
    }
}
public int BuscarPremiados(){

    int posMin, aciertos=0;
    //busqueda del menor
    for (int i=0; i<NumJugados.length; i++)
    {
        posMin = i;
        
        for (int j=i; j<Primitiva.length; j++)
        {
            if (Primitiva[j] == NumJugados[posMin])
                {
                    posMin=j;
                    aciertos++;
                }
        }
    }
    return aciertos;
}
public int SeisAciertos(){

    int contador=0,posMin, aciertos;
    
    
        //int[] PrimitivaSeis = new  int [6];

           for (int i=0; i<PrimitivaSeis.length; i++)
               { 
                   PrimitivaSeis [i]= NumeroAleatorioSeis(i);
               }

    do{
        aciertos=0;
       
        //System.out.println(Arrays.toString(PrimitivaSeis));
         int[] Num = new  int [6];
       
         for (int i=0; i<Num.length; i++)
            { 
                Num [i]= NumeroAleatorioSeis(i);
            }
     //System.out.println(Arrays.toString(Num));
         
        for (int i=0; i<Num.length; i++)
            {
             
                for (int j=0; j<PrimitivaSeis.length; j++)
                {
                    if (PrimitivaSeis[j] == Num[i])
                        {
                            aciertos++;
                        }
                }
            }

        contador++;
     }
    while(aciertos!=6);
    //}
    //while(aciertos!=6);
    return contador;
}
private int NumeroAleatorioSeis(int pos){
    
        do
            {
            this.numero = (int) (Math.random()*49 +1);
            }
        while(RepetidoSeis(this.numero, pos)==true);
        
        return this.numero;
}
private boolean RepetidoSeis(int n, int p){
    boolean repetido=false;
    int num = n;
    
    for (int i=0; i<p; i++)
    {
        if (num == PrimitivaSeis [i])
        {
            repetido=true;
            break;
        }
    }
    return repetido;
}
} //fin clase