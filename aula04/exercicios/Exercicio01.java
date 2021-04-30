package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        String resp;

        System.out.printf("Digite um numero inteiro =");
        numero = in.nextInt();

        resp = metodo1(numero);

        System.out.println(resp);

        in.close();
    }

    public static String metodo1(int a) {
        String resposta;

        if (a % 2 == 0) {
            resposta = "Numero PAR";
        } else {
            resposta = "Numero Impar";
        }

        return resposta;

    }
}
