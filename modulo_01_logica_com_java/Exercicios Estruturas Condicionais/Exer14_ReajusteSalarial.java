package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer14_ReajusteSalarial {
    public static void main(String[] args) {
        Scanner emprego = new Scanner(System.in);

        int idade;
        char sexo;
        double salario, percentual = 0;

        System.out.println("Informe a idade: ");
        idade = emprego.nextInt();

        System.out.println("Informe o sexo (M) Homem ou (F) Mulher: ");
        sexo = emprego.next().charAt(0);
    

        System.out.println("Informe o Salário: ");
        salario = emprego.nextDouble();


        if (idade > 30)
            if (sexo == 'M' && salario <= 3000) {
                salario = salario * 1.30;
                percentual = 1.30;
                System.out.printf("Novo Salário: R$ %.0f %%\n", salario, percentual);
        }

            else if (sexo == 'F') { 
                salario = salario * 1.50;
                percentual = 1.50;
                System.out.printf("Novo Salário: R$ %.0f %%\n", salario, percentual);
            }

        if (idade <= 30)
            if (sexo == 'F') {
                salario = salario * 1.40;
                percentual = 1.40;
                System.out.printf("Novo Salário: R$ %.0f %%\n", salario, percentual);
            }    

            else if (sexo == 'M') {
                salario = salario * 1.20;
                percentual = 1.20;
                System.out.printf("Novo Salário: R$ %.0f %%\n", salario, percentual);
            }

        else if (salario > 3000) {
            
            System.out.println("(0%) Não recebe aumento");
        }
            
        emprego.close();
 
    }
}
