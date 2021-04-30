package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int QTAD_TURMA = 2;
        final int QTAD_ALUNOS = 5;

        int n1=0, n2=0;
        double nota;
        double somanota=0;
        double mediaturma=0;

        for( ; n1 <= QTAD_TURMA; n1 ++){
            
            for ( ; n2 < QTAD_ALUNOS; n2 ++){
            
            System.out.printf("Media do %d alno = ", n2+1);
            nota = entrada.nextDouble();
            somanota = somanota + nota;

            }
            
            mediaturma = (somanota / QTAD_ALUNOS);

            System.out.printf("Media turma %d = %f\n ", n1, mediaturma);
        }
        
        

        entrada.close();
    }
    
}
