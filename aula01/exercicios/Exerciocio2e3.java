package exercicios;

import java.util.Scanner;

public class Exerciocio2e3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1; 
        double nota2; 
        double media;

    
        System.out.println("Digite o valor da primeira nota:");
        nota1= entrada.nextDouble();
        System.out.println("Digite o valor da segunda nota:");
        nota2 = entrada.nextDouble();
     
        media = (nota1 + nota2) / 2;
        System.out.println("Media da nota " + media);
        
        entrada.close();
        
    }
    
}
