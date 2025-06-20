import java.util.Scanner;

public class RendimentoCarro {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = sc.nextInt();

        System.out.println("Digite a distância pecorrida: ");
        double distancia = sc.nextDouble();

        System.out.println("Digite o consumo: ");
        double consumo = sc.nextDouble();

        sc.close();

        double rendimentoCarro = distancia/consumo;

        System.out.printf("O carro de modelo %s do ano %d rende %.2f KM/L", modelo, ano, rendimentoCarro);

        // double - %f , String - %s , Int - %d


    }
}