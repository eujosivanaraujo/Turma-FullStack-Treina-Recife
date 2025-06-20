package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer07_ImpostoCasal {
 public static void main(String[] args) {
    Scanner imposto = new Scanner(System.in);

    System.out.println("Informe o imposto de Renda do Homem: ");
    double rendaHomem = imposto.nextDouble();
    
    System.out.println("Informe o imposto de Renda da Mulher: ");
    double rendaMulher = imposto.nextDouble();
    
    double rendaConjunta, aliquota, impostoRenda, rendaLiquida;

    imposto.close();

    rendaConjunta = rendaHomem + rendaMulher;

         if (rendaConjunta <= 900) {
            aliquota = 0;
          }   
         else if (rendaConjunta > 900 && rendaConjunta <= 1500) {
            aliquota = 0.10;
         }
         else if (rendaConjunta > 1500 && rendaConjunta <= 2500) {
            aliquota = 0.15;
         }
        else {
            aliquota = 0.25;
         }

         impostoRenda = rendaConjunta * aliquota;
         rendaLiquida = rendaConjunta - impostoRenda;

         System.out.printf("Renda Conjunta: %.2f\n", rendaConjunta);
         System.out.printf("Percentual: %.0f%% \n", aliquota * 100);
         System.out.printf("Valor do IR: R$ %.2f\n", impostoRenda);
         System.out.printf("Renda Liquida: R$ %.2f\n", rendaLiquida);
    }

}
