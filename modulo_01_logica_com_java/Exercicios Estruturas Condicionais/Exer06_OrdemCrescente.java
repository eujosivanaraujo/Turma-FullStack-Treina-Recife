package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer06_OrdemCrescente {
    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = ordem.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = ordem.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = ordem.nextInt();
        
        int maior, meio, menor;

        ordem.close();

        if (n1 <= n2 && n2 <= n3) {
            menor = n1;
        if (n2 <= n3) {
            meio = n2;
            maior = n3;
        } else {
            meio = n3;
            maior = n2;
            } 
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        if (n1 <= n3) {
            meio = n1;
            maior = n3;
        } else {
            meio = n3;
            maior = n1;
            }
        } else {
            menor = n3;
        if (n1 <= n2) {
            meio = n1;
            maior = n2;
        } else {
            meio = n2;
            maior = n1;
            }
        }

        System.out.println("Ordem Crescente: " + menor +"," + meio + "," + maior);
        
    }
}
