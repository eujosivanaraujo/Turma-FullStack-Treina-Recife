package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class ExerAula_CalculoImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura:");
        double altura = sc.nextDouble();

        double imc = 0;

        imc = peso / (altura * altura);
        // imc = peso / Math.pow(altura, b:2);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        }
        if (imc <= 20 && imc < 25) {
            System.out.println("Peso Normal");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        }
        if (imc >= 30 && imc < 40) {
            System.out.println("Obeso");
        }
        if (imc >= 40) {
            System.out.println("Obeso Mórbido");
        }

        sc.close();
    }
}
