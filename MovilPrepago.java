package ejercicios;
public class MovilPrepago {
    public long numeroMovil;
    final private float costeEstablecLlamada;
    final private float costeMinutoLlamada ;
    final private float costeConsumoMB;
    private float saldo;

MovilPrepago (long nM, float cEL, float cML, float cMB, float s) {
    numeroMovil = nM;
    costeEstablecLlamada = cEL;
    costeMinutoLlamada = cML;
    costeConsumoMB = cMB;
    saldo =s;
}    
//MovilPrepago (MovilPrepago nM2) {
  //      long nM2;
  //  numeroMovil =nM2;
  //  costeEstablecLlamada = nM2.costeEstablecLlamada;
  //  costeMinutoLlamada =0.01f;
  //  costeConsumoMB =0.01f;
  //  saldo =s;
//} 
public void efectuarLlamada (int segundos) {
      saldo -= Math.round((costeEstablecLlamada*100) +
                           costeMinutoLlamada /60f * segundos * 100f)/100f; 
      if (saldo < 0) saldo = 0;
}
public void navegar (int mb) {
      saldo -= Math.round(costeConsumoMB* mb * 100f) / 100f;
      if (saldo < 0) saldo = 0;
}
public boolean recargar (int importe) {
      if (importe % 5 == 0) {
         saldo += importe;
         return true;
      }
      else return false;
}
public float consultarSaldo () {
      return saldo;
}
} //fin clase