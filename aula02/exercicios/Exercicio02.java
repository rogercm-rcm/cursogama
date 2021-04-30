package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        int n1;
        int n2;
        double total1;
        double total2;
        double total3;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        total1 = (n1 * 0.4);
        total2 = (n2 * 0.6);
        total3 = total1 + total2;


        if (total3 >= 6) {
            System.out.println("Aluno aprovado com = " + total3);
        }
        else{
            System.out.println("Aluno reprovado com = " + total3);  
        }
        

        entrada.close();
    }
}
