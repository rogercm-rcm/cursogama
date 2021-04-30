package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario; 
        double novosalario; 
           
        System.out.println("Digite o valor do salario:");
        salario= entrada.nextDouble();
        
        System.out.println("Novo Sálrio " + salario * 1.25);
        
        entrada.close();
        
    }
    
}

    
