package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ladoa;
        double ladob;
        double ladoc;

        System.out.println("Digite o valor do lado a");
        ladoa = entrada.nextDouble();

        System.out.println("Digite o valor do lado b");
        ladob = entrada.nextDouble();
        
        System.out.println("Digite o valor do lado c");
        ladoc = entrada.nextDouble();
        
            
        if (ladoa > ladob + ladoc || ladob > ladoa + ladoc || ladoc > ladoa + ladob) {
            System.out.println("Não é um triangulo");
        } else {
            if (ladoa == ladob && ladob == ladoc) {
                System.out.println("Triangulo equilatero");
            } else {
                if (ladoa == ladob || ladob == ladoc || ladoc == ladoa) {
                    System.out.println("Triangulo isóceles");
                } else {
                    System.out.println("Triangulo escaleno");
                }

            }
        }

        entrada.close();

    }
    
}
