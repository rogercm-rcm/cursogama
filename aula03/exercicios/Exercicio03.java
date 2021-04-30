package exercicios;

import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);  

        int n1, cont;

        System.out.println("Digite um numero inteiro = ");
        n1 = entrada.nextInt ();

        cont = 1;

        while (cont <= n1) {

            System.out.printf(cont + ", ");

            cont= (cont * 2);
        
        }





    }






        


        
}
