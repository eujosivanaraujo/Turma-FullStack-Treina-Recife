package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class ExerAula_RepeticaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número maior que zero: ");
        double numero = sc.nextDouble();

        while (numero <= 0) {
            System.out.println("Digite um número maior que zero:");
            numero = sc.nextDouble();
        }
        sc.close();

    }
}
