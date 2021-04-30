package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n1, n2=0, n3=0;

               
        for(int cont = 0 ; cont < 10; cont ++){

            System.out.printf("Digite o %dº numero = ", cont+1);
            n1 = entrada.nextInt();

            if (n1 %2 == 0){
                n2++;
                }else{
                    n3++;
                    }
                    
        }
        
        System.out.printf("Total de numeros pares = %d \n", n2);          
        System.out.printf("Total de numeros impares = %d \n", n3);
        
        entrada.close();
    }
    
}
