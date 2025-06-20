package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer09_ConversaoHoras {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Quantos segundos durou o evento: ");
        int qtdSegundos = h.nextInt();

        int horas =0; 
        int minutos = 0; 
        int segundos = 0;

        if (qtdSegundos >= horas) {
            horas = qtdSegundos / 3600;
            qtdSegundos %= 3600;
        }
        if (qtdSegundos >= minutos) {
            minutos = qtdSegundos / 60;
            qtdSegundos %= 60;
        }
        if (qtdSegundos >= segundos) {
            segundos = qtdSegundos % 60;

        }
        h.close();

        System.out.printf("HH:MM:SS = " + horas +":"+ minutos +":"+ segundos);
    }
}
