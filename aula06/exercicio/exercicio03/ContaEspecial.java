public class ContaEspecial extends Conta {

    private double limite;
    public ContaEspecial(int numero, double saldo, double limite){
        super(numero,saldo); //chama o construtor da classe super (Funcionario)
        this.limite = limite;
        }
    
        @Override
        public boolean saque(double valor) {
            if(getSaldo() + limite >= valor) {
                return super.saque(valor);
            }
            return false; // sem saldo suficiente
        }

        @Override
        public String toString() {
            return super.toString() + " limite: " + limite;
        }


}
