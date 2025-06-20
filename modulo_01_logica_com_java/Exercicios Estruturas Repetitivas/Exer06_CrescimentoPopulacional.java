package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer06_CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double popA,taxaA;
            double popB,taxaB;
            int i;

            System.out.println("Digite a qntd da população A: ");
            popA = sc.nextDouble();

            System.out.println("Digite a qntd da população B: ");
            popB = sc.nextDouble();
            
            for (i = 0; popA < popB; i++) {
                taxaA = popA * 0.03;
                popA += taxaA;

                taxaB = popB * 0.015;
                popB += taxaB;

            }

            System.out.println("Qntd de Anos: " + i);

        } finally {
            sc.close();
        }
    }
}
