package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer08_CaixaEletronico {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = caixa.nextInt();

        int notas100 = 0; int notas50 = 0;
        int notas20 = 0; int notas10 = 0;
        int notas2 = 0; int notas1 = 0;

        if (valor >= notas100) {
            notas100 = valor / 100;
            valor %= 100;
        }
        if (valor >= notas50) {
            notas50 = valor / 50;
            valor %= 50;
        }
        if (valor >= notas20) {
            notas20 = valor / 20;
            valor %= 20;
        }
        if (valor >= notas10) {
            notas10 = valor / 10;
            valor %= 10;
        }
        if (valor >= notas2) {
            notas2 = valor / 2;
            valor %= 2;
        }
        if (valor >= notas1) {
            notas1 = valor / 1;
            valor %= 1;
        }

        caixa.close();

       System.out.println(notas100 + " nota(s) de R$ 100");
       System.out.println(notas50 + " nota(s) de R$ 50");
       System.out.println(notas20 + " nota(s) de R$ 20");
       System.out.println(notas10 + " nota(s) de R$ 10");
       System.out.println(notas2 + " nota(s) de R$ 2");
       System.out.println(notas1 + " nota(s) de R$ 1");
    }

}
