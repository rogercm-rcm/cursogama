public abstract class Conta {

    private int numero;
    private double saldo;
    
    public Conta(int numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
               
    }     
    
    public int getNumero(){
          return numero;
      }

    public double getSaldo(){
        return saldo;
    }

    public boolean deposito(double valor){
        if(valor > 0){
          saldo = saldo + valor;
          return true;
        }
        return false;
    }

    public boolean saque(double valor){
        if(valor > 0){
          saldo = saldo - valor;
          return true;
        }
        return false;
    }

    @Override
    public String toString() {
      //return "Conta - " + numero + " Saldo de - R$" + saldo;
      return numero + " - " + saldo;
    }
    
}
