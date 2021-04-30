package exemplo01;

public class Gerente extends Funcionario {
    //herança

    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome,salario); //chama o construtor da classe super (Funcionario)
        this.numFuncionarios = numFuncionarios;
        //System.out.println(nome+", "+ salario);
        //System.out.println(numfuncionarios);
    }
    
    public Gerente(String nome, double salario){
        super(nome,salario); //chama o construtor da classe super (Funcionario)
        this.numFuncionarios = 0;
        //System.out.println(nome+", "+ salario);
        //System.out.println(numfuncionarios);
    }

    @Override
    public void exibir() {
        System.out.println(getNome() + "," + numFuncionarios);
    }
        
   @Override
    public String toString() {
        return super.toString() + ", " + numFuncionarios;
    }


}
