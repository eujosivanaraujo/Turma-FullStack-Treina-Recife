package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer05Aula_CalculoLucro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

        double i;
        double somaValor = 0, somaCusto = 0, lucro = 0, valor, custo;

        /*
         * while (i < 5) {
         * System.out.println("Digite o valor da venda: ");
         * double valor = sc.nextDouble();
         * 
         * somaValor += valor;
         * 
         * System.out.println("Digite o valor do custo: ");
         * double custo = sc.nextDouble();
         * 
         * somaCusto += custo;
         * 
         * i++;
         * }
         * lucro = somaValor - somaCusto;
         * 
         * System.out.println("Lucro das vendas: " + lucro);
         */

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o valor da venda: ");
            valor = sc.nextDouble();

            somaValor += valor;

            System.out.println("Digite o valor do custo: ");
            custo = sc.nextDouble();

            somaCusto += custo;
        }

        lucro = somaValor - somaCusto;

        System.out.println("Lucro das vendas: " + lucro);

        } finally {
        sc.close();
        }
    }
}
