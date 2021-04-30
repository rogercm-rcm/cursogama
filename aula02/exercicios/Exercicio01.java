package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        int n1;

        n1 = entrada.nextInt();

        if (n1 > 20) {

            System.out.println("Segue o valor" +  n1 / 2);
          
        }
        System.out.println("Valor = " + n1);

        entrada.close();
        
    }
    
}
