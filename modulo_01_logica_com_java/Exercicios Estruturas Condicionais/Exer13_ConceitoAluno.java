package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer13_ConceitoAluno {
    public static void main(String[] args) {
        Scanner aula = new Scanner(System.in);

        double nota;

        System.out.print("Informe a nota do aluno: ");
        nota = aula.nextDouble();

        if (nota >= 9) {
            
            System.out.println("Conceito: A");
        }

            if (nota >= 8 && nota <= 9) {
                
                System.out.println("Conceito: B");
            }

                if (nota >= 7 && nota <= 8) {
                    
                    System.out.println("Conceito: C");
                }

                    if (nota < 7) {
                        
                        System.out.println("Conceito: D");
                    }
        aula.close();
    }
}
