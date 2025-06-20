package ExerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exer12_DefinicaoAnimal {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);

        String tipo = "";
        String especie = "";
        String alimentacao = "";

        System.out.println("vertebrado ou invertebrado: ");
        tipo = animal.nextLine();

            if (tipo.equals("vertebrado")) {
                System.out.println("ave ou mamifero");
                especie = animal.nextLine();
                }

                if (especie.equals("ave")) {                  
                    System.out.println("carnivoro ou onivoro");
                    alimentacao = animal.nextLine();
                    }

                    if (alimentacao.equals("carnivoro")) {
                        System.out.println("O animal é: Águia");
                        
                        }

                    else if (alimentacao.equals("onivoro")) {
                            System.out.println("O animal é: Pomba");
                    }

                else if (especie.equals("mamifero")) {                      
                System.out.println("onivoro ou herbivoro");
                alimentacao = animal.nextLine();
                }

                    if (alimentacao.equals("onivoro")) {
                        System.out.println("O animal é: Homem");
                        }

                    else if (alimentacao.equals("herbivoro")) {
                        System.out.println("O animal é: Vaca");
                    }
                    
            else if (tipo.equals("invertebrado")) {          
                System.out.println("inseto ou anelídeo");
                especie = animal.nextLine();
                }

                if (especie.equals("inseto")) {
                    System.out.println("hematofago ou herbivoro");
                    alimentacao = animal.nextLine();
                    }

                    if (alimentacao.equals("hematofago")) {
                        System.out.println("O animel é: Pulga");
                        }

                    else if (alimentacao.equals("herbivoro")) {
                            System.out.println("O animal é: Largata");;
                    }

                else if (especie.equals("anelídeo")) {
                    System.out.println("hematofago ou onivoro");
                    alimentacao = animal.nextLine();
                    } 
                    
                        if (alimentacao.equals("hematofago")) {
                        System.out.println("O animal é: Sanguessuga");
                        }

                            else if (alimentacao.equals("onivoro")) {
                                System.out.println("O animal é: Minhoca");
                            }


        animal.close();


    }
}