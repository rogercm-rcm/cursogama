package exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1 = 1; 
        int soma = 0;
        int cont = 1;


        // System.out.printf("Digite um numero inteiro, para sair do programa tecle 0 = ");
        // n1 = entrada.nextInt();

        while (n1 != 0) {
            System.out.printf("Digite o %dº numero inteiro, para sair do programa tecle 0 = ", cont);
            n1 = entrada.nextInt();
            soma = (soma + n1);
            cont ++;

        }

        System.out.println("Total = " + soma);

        
    }

}
