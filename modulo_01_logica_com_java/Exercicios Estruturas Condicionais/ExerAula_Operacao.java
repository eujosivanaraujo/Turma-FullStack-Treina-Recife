package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class ExerAula_Operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        String s = """
                Escolha as opeções abaixo:
                (1) para soma
                (2) para subtração
                (3) para multiplicação
                (4) para divisão
                Opção escolhida: """;
        System.out.print(s);
        
        int operacao = sc.nextInt();
        int resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("A soma é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Asubtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("A multiplicação é: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("A divisão é: " + resultado);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;

            }
              if (resultado % 2 == 0) {
              System.out.println("O número é Par!");
              } else {
              System.out.println("O número é Impar!");
              }
              if (resultado >= 0) {
              System.out.println("O número é Positivo!");
             } else {
             System.out.println("O número é Negativo!");
              }
             
        sc.close();

    }
}
