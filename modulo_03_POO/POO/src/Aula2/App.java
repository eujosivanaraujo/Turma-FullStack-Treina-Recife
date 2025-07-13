package Aula2;

public class App {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Josivan", 121, "Programação Orientada a Objeto.");
        aluno.exibirDetalhes();

        Aluno aluno1 = new Aluno("Rodrigo", 27, "Programação Orientada a Objeto.");
        aluno1.exibirDetalhes();

        Produto perfume = new Produto("212", 500, 1);
        perfume.exibirInfo();
        
        Carro carro = new Carro();
        carro.setMarca("FIAT");
        carro.setVelocidade(60);
        carro.acelerar(80);
        System.out.println("Aumemtar a velocidade para: " + carro.getVelocidade() + " km/h");
        carro.frear(40);
        System.out.println("Diminuir a velocidade para: " + carro.getVelocidade() + " km/h");
        carro.exibirInfo();

        Temperatura temperatura = new Temperatura();
        temperatura.setTemperatura(30);
        System.out.printf("Temperatura em Celsius: " + temperatura.getTemperatura() + "ºC%n");

        temperatura.exibirTemperaturarFehrenheit();

        Musica musica = new Musica();

        musica.setTitulo("Deixa a vida me levar");
        musica.setArtista("Zeca Pagodinho");
        musica.setDuracao(240);

        musica.exibirInfo();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Josivan");
        pessoa1.setIdade(33);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        
    }
}
