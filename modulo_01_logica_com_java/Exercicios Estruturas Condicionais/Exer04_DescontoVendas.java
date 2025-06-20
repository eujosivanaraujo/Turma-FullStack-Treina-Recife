package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer04_DescontoVendas {

    public static void main(String[] args) {
        Scanner promocao = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = promocao.nextDouble();
        double desconto, valorFinal;

        promocao.close();

        if (valorCompra > 500.0) {
            desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.printf("Valor a pagar é: R$ %.2f\n", valorFinal);
        } else {
            System.out.println("Intem não tem Desconto!");
        }
    }
}