package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer11_DuracaoJogo {
    public static void main(String[] args) {
        Scanner estadio = new Scanner(System.in);

        int horaInicial, horaFinal, duracaJogo;

        System.out.println("Informe a hora do inicio do jogo: ");
        horaInicial = estadio.nextInt();

        System.out.println("Informe a hora do final do jogo: ");
        horaFinal = estadio.nextInt();

        estadio.close();

        if (horaInicial >= horaFinal) {
            duracaJogo = (24 + horaFinal) - horaInicial;
        }
        else {
            duracaJogo = horaFinal - horaInicial;
        }

            System.out.print("O jogo durou: " + duracaJogo + "h");
    }
}
