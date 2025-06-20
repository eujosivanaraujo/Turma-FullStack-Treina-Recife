package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer13Aula_MediaSemestral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota Inválida");
            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextDouble();
        }

        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota Inválida");
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextDouble();
        }
         media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);

        sc.close();

    }
}
