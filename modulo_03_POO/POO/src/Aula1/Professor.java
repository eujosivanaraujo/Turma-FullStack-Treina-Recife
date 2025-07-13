package Aula1;
public class Professor {

    //ATRIBUTOS
    String nome;
    String disciplina;
    Livro livro;

    //MÉTODOS
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e ensino " + disciplina + ".");
    }

    void relacionarLivro() {
        if (livro != null) {
            System.out.println("Livro relacionado.");
        } else {
            System.out.println("Livro não relacionado.");
        }
    }
}
