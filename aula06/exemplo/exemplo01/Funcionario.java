package exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
 
    public String getNome(){
        return nome;
    }

    public void exibir(){
        System.out.println(nome+", "+ salario);
        //System.out.println(numfuncionarios);
    }

    @Override
    public String toString() {
        return nome + ", " + salario;
        
    }



    
}