package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n1, n2=0, n3=0;
        double media;
        double porcentagem;
        double somapar=0;

        final int QTAD_NUMEROS = 10;
        

        for(int cont = 0 ; cont < QTAD_NUMEROS; cont ++){

            System.out.printf("Digite o %dº numero = ", cont+1);
            n1 = entrada.nextInt();

            if (n1 %2 == 0){
                n2++;
                somapar = (n1++);
                }else{
                    n3++;
                    }
                    
        }
        
        System.out.printf("Total de numeros pares = %d \n", n2);
        System.out.printf("Total de numeros impares = %d \n", n3);

        media = (somapar / n2);
        porcentagem = (n3 /QTAD_NUMEROS );

        System.out.printf("Media de numero pares = %d \n", media);
        System.out.printf("Porcentagem de numeros impares", porcentagem);


        entrada.close();
    }
    
}
