package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        double n1;
        double n2;
        
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();

        
        if (n1 > n2) {
            System.out.println("Primeiro numero = " + n1);
            System.out.println("Segundo numero = " + n2);
        }
        else{
            System.out.println("Primeiro numero = " + n2); 
            System.out.println("Segundo  numero = " + n1);
        }
        

        entrada.close();
    }
    
}
