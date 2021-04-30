import java.util.Scanner;

public class Appconta {

    public static void main(String[] args) {
        /*
         * ContaCorrente conta = new ContaCorrente(1234, 10.000);
         * 
         * System.out.println(conta);
         * 
         * if(conta.deposito(500)){ System.out.println("Sucesso"); }else{
         * System.out.println("Falha"); };
         * 
         * System.out.println(conta);
         */

        /*
         * ContaPoupanca conta = new ContaPoupanca(1234, 10.000);
         * System.out.println(conta); conta.deposito(100); ContaPoupanca.setTaxa(0.20);
         * //metodo static conta.saque(20); System.out.println(conta);
         */

        Scanner teclado = new Scanner(System.in);
        int opcaoMenu;
        int numeroConta;
        double limite;
        double valor;
        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1 - Nova conta corrente");
            System.out.println("2 - Nova conta especial");
            System.out.println("3 - Nova conta poupanca");
            System.out.println("4 - Realizar deposito");
            System.out.println("5 - Realizar saque");
            System.out.println("6 - Exibir saldo");
            System.out.println("7 - Sair do menu");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {
            case 1:
                System.out.println("Digite o número da conta :");
                numeroConta = teclado.nextInt();
                contas.novaContaCorrente(numeroConta, 0);
                break;
            case 2:
                System.out.println("Digite o número da conta Especial :");
                numeroConta = teclado.nextInt();
                System.out.println("Iformar o valor limite");
                limite = teclado.nextDouble();
                contas.novaContaEspecial(numeroConta, limite);
                break;
            case 3:
                System.out.println("Digite o número da conta Poupanca :");
                numeroConta = teclado.nextInt();
                contas.novaContaPoupanca(numeroConta);
                break;
            case 4:
                System.out.println("Digite o número da conta :");
                numeroConta = teclado.nextInt();
                System.out.println("Digite o valor :");
                valor = teclado.nextDouble();
                if (contas.depositar(numeroConta, valor)) {
                    System.out.println("operacao realizada");
                } else {
                    System.out.println("operacao nao realizada");
                }

                break;
            case 5:
                System.out.println("Digite o número da conta :");
                numeroConta = teclado.nextInt();
                System.out.println("Digite o valor :");
                valor = teclado.nextDouble();
                if (contas.sacar(numeroConta, valor)) {
                    System.out.println("operacao realizada");
                } else {
                    System.out.println("operacao nao realizada");
                }

                break;
            case 6:
                System.out.println("Digite o número da conta :");
                numeroConta = teclado.nextInt();
                System.out.println(contas.obterSaldo(numeroConta));
                break;
            case 7:

                break;

            default:
                System.out.println("Opcao invalida");
                break;
            }

        } while (opcaoMenu != 7);

        teclado.close();

    }

}
