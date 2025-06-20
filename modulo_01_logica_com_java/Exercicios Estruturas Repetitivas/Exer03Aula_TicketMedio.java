package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer03Aula_TicketMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

        double soma = 0;
        double i = 0;
        double media = 0;
        double valor = 0;

        /* while (i < 7) {
            System.out.println("Digite o valor ticket: ");
            double valor = sc.nextDouble();
            soma += valor;
            i++;
        }
            double media = soma / 7;
            System.out.println(soma);
            System.out.printf("%.2f ", media);*/

            for (i = 0; i < 7; i++) {
                System.out.println("Digite o valor do ticket: ");
                valor = sc.nextDouble();
                soma += valor;
            }

            media = soma / 7;
            System.out.println(soma);
            System.out.printf("%.2f", media);
            
        } finally {
        sc.close(); 
        }

    }
}
