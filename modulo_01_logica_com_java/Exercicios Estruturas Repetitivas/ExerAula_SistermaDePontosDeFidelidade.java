package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class ExerAula_SistermaDePontosDeFidelidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal;
        int compras;
        int pontos;

        System.out.println("Digite o valor total de compras no mêS: ");
        valorTotal = sc.nextDouble();

        System.out.println("Digite o numero de compras no mêS: ");
        compras = sc.nextInt();

        sc.close();

        pontos = (int) valorTotal / 10;

        if (compras >= 5) {
            pontos = pontos + 50;
        }

        if (valorTotal >= 500) {
            pontos = pontos + 100;
        }

        String categoria;

        if (pontos <= 100) {
            categoria = "Bronze";
        } else if (pontos <= 300) {
            categoria = "Prata";
        } else if (pontos <= 500) {
            categoria = "Ouro";
        } else {
            categoria = "Diamante";
        }
        System.out.println("Total de compras no mês: " + valorTotal);
        System.out.println("Números de Compras: " + compras);
        System.out.println("Total de Pontos: " + pontos);
        System.out.println("Categoria: " + categoria);
        System.out.println("Parabéns! Você alcançou a categoria " + categoria + " este mês");
    }
}
