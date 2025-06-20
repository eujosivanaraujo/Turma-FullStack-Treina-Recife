package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer04_MaiorMenorVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            double maior = 0;
            double menor = 0;
            double valor;

            for (int i = 0; i < 10; i++) {

                System.out.println("Digite o valor da venda: ");
                valor = sc.nextDouble();

                if (valor > maior) {
                    maior = valor;
                }
                if (valor < maior) {
                    menor = valor;
                }

            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);

        } finally {
            sc.close();
        }
    }
}
