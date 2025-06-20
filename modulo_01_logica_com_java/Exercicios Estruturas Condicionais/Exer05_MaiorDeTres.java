package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer05_MaiorDeTres {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = valores.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = valores.nextInt();

        System.out.println("Digite o terceiro número:");
        int n3 = valores.nextInt();
        int maior;
        int menor;

        if (n1 > n2) {
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;     
        } else {
            maior = n3;
        } if (n1 < n2) {
            menor = n1;
        } else if (n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);

        valores.close();
    }
}
