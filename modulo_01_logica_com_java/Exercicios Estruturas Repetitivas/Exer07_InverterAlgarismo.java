package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer07_InverterAlgarismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número de 4 algarismos: ");
            int numero = sc.nextInt();

            int invertido = 0;

            // Usando for para iterar enquanto numero > 0
            for (; numero > 0; numero /= 10) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
            }

            System.out.println("Número invertido: " + invertido);

        } finally {
            sc.close();
        }
    }
}
