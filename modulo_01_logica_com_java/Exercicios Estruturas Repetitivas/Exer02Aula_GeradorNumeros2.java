package ExerciciosEstruturasRepetitivas;

import java.util.Scanner;

public class Exer02Aula_GeradorNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        /*int contador = 0;

        //criterio de parada
        while (contador < 6) {
            numero++;
            System.out.println(numero);

            //atualizar o contador
            contador++;
        
        }*/

        for (int i = 0; i < 6; i++) {
            numero++;
            System.out.println(numero);
        }
        sc.close();
    }
}
