package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorveiculo; 
        double lucroveiculo;
        double imposto;
        double custofinal;
                   
        System.out.println("Digite o valor de custo de fabrica do veiculo:");
        valorveiculo= entrada.nextDouble();
        
        lucroveiculo = valorveiculo * 0.28;
        imposto = valorveiculo * 0.45;
        custofinal = valorveiculo + lucroveiculo + imposto;

        System.out.println("Valor de 28% do veiculo" + lucroveiculo);
        System.out.println("Valor de imposto do veiculo" + imposto);
        System.out.println("Valor final do veiculo" + custofinal);
        
        entrada.close();
        
    }
    
    
}
