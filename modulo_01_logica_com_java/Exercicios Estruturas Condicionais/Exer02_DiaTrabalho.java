package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer02_DiaTrabalho {
    public static void main(String[] args) {
        Scanner trabalho = new Scanner(System.in);

        System.out.println("Informe seu salário atual: ");
        double salarioAtual = trabalho.nextDouble();
        double novoSalario;

        trabalho.close();

        if (salarioAtual < 1100.0) {
            novoSalario = salarioAtual * 1.10;
        } 
        else if (salarioAtual < 2000.0) {
            novoSalario = salarioAtual * 1.07;
        } 
        else {
            novoSalario = salarioAtual * 1.05;
        }

        System.out.printf("Seu novo salário é: R$ %.2f\n", novoSalario);
    }
}
