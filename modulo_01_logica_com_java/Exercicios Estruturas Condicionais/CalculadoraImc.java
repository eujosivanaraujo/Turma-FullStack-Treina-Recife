import java.util.Scanner;

public class CalculadoraImc {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();

        sc.close();

        double calculadora = peso / (altura * altura);

        System.out.printf("IMC: %.2f", calculadora);


    }

}