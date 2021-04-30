package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero, numero2, numero3;
        int resp;

        System.out.printf("Digite 1ª numero inteiro =");
        numero = in.nextInt();
        System.out.printf("Digite 2ª numero inteiro =");
        numero2 = in.nextInt();
        System.out.printf("Digite 3ª numero inteiro =");
        numero3 = in.nextInt();


        resp = metodo1(numero, numero2, numero3);

        if (codret=0) {
            System.out.printf("O numero %d é o maior", numero);
        }else{
            if (codret=1){
                System.out.printf("O numero %d é o maior", numero2);{
                }else{
                    System.out.printf("O numero %d é o maior", numero3);    
                }
            }
        }

        in.close();
    }

    public static int metodo1(int a, int b, int c) {
        int codret;

        if (a => b && a =. c) {
            codret = 0;
        } else {
            if (b => a && b => c)
            codret = 1;}{
                else
                codret=2
               }
           }
        }

        return codret;

    }
}
