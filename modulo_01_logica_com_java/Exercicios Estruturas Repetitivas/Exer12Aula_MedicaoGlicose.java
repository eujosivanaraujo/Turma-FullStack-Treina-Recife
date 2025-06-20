package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer12Aula_MedicaoGlicose {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {

    int i=0, medicao=0,soma=0;
    double media;

    for (i = 0; i < 4; i++) {  
        System.out.println("Digite a taxa da glicose: ");
        medicao = sc.nextInt();
        soma += medicao;
    
        if (medicao < 110) {
            System.out.println(medicao + " NORMAL");
        }
        else if (medicao >= 110 && medicao <= 125) {
            System.out.println(medicao + " ALTERADA");
        }
        else if (medicao > 125) {
            System.out.println(medicao + " MUITO ALTA");
        }
    }

            media = soma / 4;
            System.out.printf("A média das leituras: %.2f", media);

    } finally {
    sc.close();
    }
    }  
}
