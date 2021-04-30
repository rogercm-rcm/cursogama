package uri;

import java.util.Scanner;

public class Uri2003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valora, valorb, valorc, valord;
        

        System.out.println("Digite o valor a");
        valora = entrada.nextInt();
        
        System.out.println("Digite o valor b");
        valorb = entrada.nextInt();

        System.out.println("Digite o valor c");
        valorc = entrada.nextInt();
      
        System.out.println("Digite o valor d");
        valord = entrada.nextInt();

        if (valorb > valorc && valord > valora && (valorc + valord) > (valora + valorb) && valorc > 0 && valord > 0 &&(valora % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
         
        entrada.close();

    }
    
}
