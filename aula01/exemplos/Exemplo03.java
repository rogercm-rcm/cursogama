package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
    int valor;
    double valorDecimal;

    System.out.println("Digite o valor inteiro:");
    valor= entrada.nextInt();
    System.out.println("Digite o valor decimal:");
    valorDecimal = entrada.nextDouble();
 
    System.out.println("Voce Digitou " + valor + " e " +valorDecimal);
    
    entrada.close();

    }
    

}
