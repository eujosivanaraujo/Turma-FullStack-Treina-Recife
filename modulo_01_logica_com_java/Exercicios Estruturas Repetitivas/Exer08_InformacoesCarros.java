package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer08_InformacoesCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int grupos = 4;
        final int carrosPorGrupo = 3;
        
        for (int g = 1; g <= grupos; g++) {
            int anoMaisNovo = Integer.MIN_VALUE;  // menor valor possível para começar
            int velocidadeMaisRapida = Integer.MIN_VALUE;
            double somaVelocidade = 0;
            
            System.out.println("Grupo " + g);
            
            for (int c = 1; c <= carrosPorGrupo; c++) {
                System.out.print("Digite o ano do carro " + c + ": ");
                int ano = sc.nextInt();
                
                System.out.print("Digite a velocidade do carro " + c + ": ");
                int velocidade = sc.nextInt();
                
                if (ano > anoMaisNovo) {
                    anoMaisNovo = ano;
                }
                
                if (velocidade > velocidadeMaisRapida) {
                    velocidadeMaisRapida = velocidade;
                }
                
                somaVelocidade += velocidade;
            }
            
            double velocidadeMedia = somaVelocidade / carrosPorGrupo;
            
            System.out.println("Ano do carro mais novo: " + anoMaisNovo);
            System.out.println("Velocidade do carro mais rápido: " + velocidadeMaisRapida);
            System.out.printf("Velocidade média do grupo: %.2f\n", velocidadeMedia);
            System.out.println("-----------------------------");
        }
        
        sc.close();
    }
}