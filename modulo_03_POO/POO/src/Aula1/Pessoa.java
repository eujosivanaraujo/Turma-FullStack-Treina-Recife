package Aula1;
public class Pessoa {

    //ATRIBUTOS
    String nome;
    int idade;
    String sexo;
    Livro livro;

    //METODOS
    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

    void fazerAniversaio() {
        idade++;
    }

        //CRIANDO MÉTODO PARA COMPARAR SEM TEM LIVRO
    void verificarLivro() {
        if (livro != null) {
            System.out.println(this.nome + " possui o livro.");
        } else {
            System.out.println(this.nome + " não possui o livro.");
        }
    }

    //CONSTRUTOR VAZIO
    Pessoa() {
        System.out.println("----------////----------");
        System.out.println("Pessoa criada com sucesso!");
    }

    //CONSTRUTOR COM PARÂMETROS
    Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        System.out.println("---------------------------");
        System.out.println("Pessoa " + nome + " criada com sucesso!");
    }
}
