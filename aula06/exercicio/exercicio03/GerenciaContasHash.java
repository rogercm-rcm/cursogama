import java.util.ArrayList;

public class GerenciaContasHash {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContasHash(){
        listaDeContas = new ArrayList<>();

    }

    public void novaContaCorrente(int numeroConta, double valor){
        listaDeContas.add(new ContaCorrente(numeroConta, valor));
    }
    
    public void novaContaEspecial(int numeroConta, double limite){
        listaDeContas.add(new ContaEspecial(numeroConta, 0, limite));
    }
    
    public void novaContaPoupanca(int numeroConta){
        listaDeContas.add(new ContaPoupanca(numeroConta, 0));
    }

    public boolean depositar(int numeroConta, double valor){
        for (Conta conta : listaDeContas) {
            if(conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
                
            }
        }
        return false;
    }
    public boolean sacar(int numeroConta, double valor){
        for (Conta conta : listaDeContas) {
            if(conta.getNumero() == numeroConta) {
                return conta.saque(valor);
                
            }
        }
        return false;
    }

    public String obterSaldo(int numeroConta){
        for (Conta conta : listaDeContas) {
            if(conta.getNumero() == numeroConta) {
                return conta.toString();
                
            }
        }
        return "Conta nao encontrada.";
    }

}
