package ejercicios;
public class Ruleta {
    public int numero;
    private float apostado;
    private int posiciones;
    private boolean tipoapuesta;
    public int premio;
    private boolean ParImpar;
    
Ruleta (int apos, boolean par ){
    //dinero apostado
    this.apostado=apos;
    
    //numero apostado
    //this.numApostado=num;
    
    //aposto a par o a impar
    this.tipoapuesta=par;
    //numeros de la ruleta
    this.posiciones=36; 
}

 int NumeroAzar(){
    return this.numero = (int)(Math.random()*37);
}
boolean NumeroParImpar(){
    if (this.numero%2==0 && numero!=0)
        return true;
    
    return false;
}
int Premio (){
    if (this.numero==0)
        return premio =0;
    else 
    {
        ParImpar= NumeroParImpar();
        if ((this.tipoapuesta==true && ParImpar) ||(this.tipoapuesta==false && ParImpar==false))
        {return this.premio=(int) (apostado*2);}

        return premio=0;
    }
}
} // fin 
    
  
 

 
  
    