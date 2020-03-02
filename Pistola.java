package ejercicios;
/**
 *
 * @author uffog
 * 
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
 */

public class Pistola{

    int posicionAzar,posIni=0;
    boolean disparo1=false,disparo2=false,disparo3=false,disparo4=false,
            disparo5=false,disparo6=false;
    
public void comenzarJuego(){
        switch (posicionAzar()) {
            case 1:this.disparo1=true;break;
            case 2:this.disparo2=true;break;
            case 3:this.disparo3=true;break;
            case 4:this.disparo4=true;break;
            case 5:this.disparo5=true;break;
            case 6:this.disparo6=true;break;
        }
}
private int posicionAzar(){
    return this.posicionAzar = (int)(Math.random()*6);
}
public boolean jugar(int p){
       int pos=p;
       switch (pos) {
           case 1: if(this.disparo1==true){return true;};break;
           case 2: if(this.disparo2==true){return true;};break;
           case 3: if(this.disparo3==true){return true;};break;
           case 4: if(this.disparo4==true){return true;};break;
           case 5: if(this.disparo5==true){return true;};break;
           case 6: if(this.disparo6==true){return true;};break;
        }
       return false;
}
}


