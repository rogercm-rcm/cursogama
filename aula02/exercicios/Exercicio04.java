package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        double salariobruto;
        double prestacao;
        double valorprestacao;
        
        System.out.println("Digite o valor do salario bruto");
        salariobruto = entrada.nextDouble();

        System.out.println("Digite o valor da prestação");
        prestacao = entrada.nextDouble();

        valorprestacao = prestacao * 0.30;
      
        if (valorprestacao >= salariobruto) {
            System.out.println("O emprestimos não pode ser concedido, pois o valor da prestação é " + valorprestacao);
        }
        else{
            System.out.println("O emsprestimo pode ser concedido, pois o valor da prestação é " + valorprestacao); 
        }
        

        entrada.close();
    }
    
}
