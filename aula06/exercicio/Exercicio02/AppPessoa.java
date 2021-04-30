public class AppPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcia", "99999999999");
        Pessoa estudante = new Estudante("Douglas", "12345678", "Sistemas Digitais");
        Pessoa professor = new Professor("Douglas", "12345678", 10000);

        System.out.println(pessoa);
        System.out.println(estudante);
        System.out.println(professor);
    }
    
}
