package ExerciciosEstruturasCondicionais;
import java.util.Scanner;

public class Exer01_PesquePague {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso dos peixes: ");
        double pesoPeixe = sc.nextDouble();

        double pesoLimite = 50;
        double multaKg = 4.0;

        sc.close();

        if (pesoPeixe > pesoLimite) {

            double excesso = pesoPeixe - pesoLimite;
            double ValorPagar = multaKg * excesso;

            System.out.printf(" Existe excesso de peso: %.1f KG\n ", excesso);
            System.out.printf("Multa a pagar é: R$ %.2f\n", ValorPagar);

        } else {
            
            System.out.println("Peso OK!");
        }
    }
}