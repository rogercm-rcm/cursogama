public class ContaCorrente extends Conta {

    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero, double saldo){
        super(numero,saldo); //chama o construtor da classe super (Funcionario)
        }

    @Override
    public boolean deposito(double valor){
        return  super.deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean saque(double valor){
        if(getSaldo() >= valor){
        return  super.saque(valor);
        }
        return false; //não tem saldo
    }
    
}
