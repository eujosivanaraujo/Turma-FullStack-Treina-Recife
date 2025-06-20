package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer10_ConversaoData {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Informe a sua idade em dias: ");
        int idade = data.nextInt();

        int ano = 0; int mes = 0; int dia = 0;

        if (idade >= ano) {
            ano = idade / 365;
            idade %= 365;
                                   
        }
        if (idade >= mes) {
            mes = idade / 30;
            idade %= 30;
            
        }
        if (idade >= dia) {
            dia = idade % 30;
            
        }
        data.close();

        System.out.println(ano +" Ano(s)");
        System.out.println(mes +" Mês(es)");
        System.out.println(dia +" Dia(s)");
        



    }
}
