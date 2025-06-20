package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer03_ReposicaoEstoque {
    public static void main(String[] args) {
        Scanner loja = new Scanner(System.in);

       System.out.println("Informe a quantidade em estoque: ");
       double qtdEstoque = loja.nextDouble();

       if (qtdEstoque < 10) {
        System.out.println("Produto em falta. Deve ser reabastecido!");
       } else {
        System.out.println("Estoque Suficiente!");
       }
       loja.close();
    }
}
