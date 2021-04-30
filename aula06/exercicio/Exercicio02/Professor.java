public class Professor extends Pessoa{

    private Double salario;

    public Professor(String nome, String telefone, double salario){
        super(nome, telefone);
        this.salario = salario;
        
    }

    @Override
    public String toString() {
    return super.toString() + " - " + salario;
    }   
    
}
