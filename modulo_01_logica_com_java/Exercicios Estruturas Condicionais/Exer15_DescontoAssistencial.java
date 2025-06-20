package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer15_DescontoAssistencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char bairro;
        double renda, desconto = 0, consumo;

        System.out.println("Informe o Bairro: ");
        bairro = sc.next().charAt(0);

        System.out.println("Informe a Renda: ");
        renda = sc.nextDouble();

        System.out.println("Informe o Consumo: ");
        consumo = sc.nextDouble();

        switch (bairro) {
            case 'S':
                System.out.println("Bairro: Santa Ana");
                break;
            case 'I':
                System.out.println(" Bairro: Industriários");
                break;
            case 'T':
                System.out.println("Bairro: Tabatinga");
                break;
            default:
            System.out.println("Bairro Inválido!");
                break;
        }
        if (renda < 50 && renda > 10.000) {
            System.out.println("Não haverá desconto!");
        }
        else if (renda < 0 || consumo < 0) {
            System.out.println("Renda ou Consumo não podem ser negativos!");
        }
        if (bairro == 'S' && renda >= 50 && renda <= 500) {
            desconto = 50;
        }
        if (bairro == 'S' && renda > 500 && renda <= 1000) {
            desconto = 25;
        }
        if (bairro == 'I' && renda >= 240 && renda <= 1000) {
            desconto = 240;
        }
        if (bairro == 'I' && renda >= 1000 && renda <= 5000) {
            desconto = 120;
        }
        if (bairro == 'T' && renda >= 5000 && renda <= 10000) {
            desconto = 720;
        }
        if (bairro == 'T' && renda >= 10000 && renda <= 20000) {
            desconto = 360;
        }
        sc.close();
        
        consumo = consumo - desconto;

        System.out.println("Renda: " + renda);
        System.out.println("Valor a Pagar: " + consumo);
        
    }
}
