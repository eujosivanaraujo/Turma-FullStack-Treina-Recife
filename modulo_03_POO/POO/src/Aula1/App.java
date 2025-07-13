package Aula1;
public class App {
    public static void main(String[] args) throws Exception {
        
        /*// Introdução a objeto

        Autor autor = new Autor();
        autor.nome = "Isabela Nogueira";
        autor.email = "isabela@email.com";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 60;
        livro.autor = autor;

        livro.retornaAutor();
        // System.out.println("O nome do livro é " + livro.nome);
        // System.out.println(livro.descricao);
        // System.out.println(livro.valor);

        // Introdução à métodos de uma classe
        // livro.mostrarDetalhesLivro();
        // livro.aplicaDescontoDe(0.1);

        // Autor outroAutor = new Autor();
        // outroAutor.nome = "Rodrigo Turini";
        // outroAutor.email = "rodrigo.turini@caelum.com.br";
        // outroAutor.cpf = "123.456.789.10";

        // Livro outroLivro = new Livro();

        // outroLivro.nome = "Lógica de Programação";
        // outroLivro.descricao = "Crie seus primeiros programas";
        // outroLivro.valor = 59.90;
        // outroLivro.autor = outroAutor;

        // System.out.println("---------------------------");
        // System.out.println(outroLivro.nome);
        // System.out.println(outroLivro.descricao);
        // System.out.println(outroLivro.valor);

        // outroLivro.mostrarDetalhesLivro();

        // Referência a objetos
        // if (autor == outroAutor) {
        // System.out.println("Iguais, mesmo autor!");
        // } else {
        // System.out.println("hein!? Por que diferentes?");
        // }

        // Construtor
        // Livro livro1 = new Livro();
        // Livro livro2 = new Livro();
        // Livro livro3 = new Livro();
        // Livro livro4 = new Livro();

    }
} */

        //CRIANDO O PRIMEIRO OBJETO DA CLASSE PESSOA
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Josivan";
        pessoa1.idade = 34;
        pessoa1.sexo = "Masculino";

        //CRIANDO O SEGUNDO OBJETO DA CLASSE PESSOA
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Rodrigo";
        pessoa2.idade = 27;
        pessoa2.sexo = "Masculino";

        //CHAMANDO OS MÉTODOS
        System.out.println("Pessoa 1:");
        pessoa1.mostrarDetalhes();
        pessoa1.fazerAniversaio();
        System.out.println("Idade depois do aniversário: " + pessoa1.idade);
        System.out.println("-----------------------------");


        System.out.println("Pessoa 2:");
        pessoa2.mostrarDetalhes();
        pessoa2.fazerAniversaio();
        System.out.println("Idade depois do aniversário: " + pessoa2.idade);
        System.out.println("---------------------------");


        if (pessoa1 == pessoa2) {
            System.out.println("As pessoas são IGUAIS.");
        } else {
            System.out.println("As pessoas são DIFERENTES.");
        }

        //CRIANDO OBJETO PESSOA COM O CONSTRUTOR PARÂMETROS
        Pessoa pessoa = new Pessoa("Maria", 40, "Feminino");

        //CHAMANDO O MÉTODO
        pessoa.mostrarDetalhes();

        System.out.println("--------------------------");

        //CRIANDO O PRIMEIRO OBJETO DA CLASSE LIVRO
        Livro livro1 = new Livro();
        livro1.titulo = "A CABANA";
        livro1.numeroDePaginas = 236;

        //CHAMANDO OS MÉTODOS
        livro1.mostrarDetalhes();
        livro1.abrirLivro();

        //CRIANDO UM OBJETO LIVRO VAZIO
        Livro livro = new Livro();  
        livro.novoLivro();

        System.out.println("---------------------");

        //VERIFICANDO SEM TEM LIVRO E ADICIONANDO LIVRO A PESSOA2
        pessoa1.verificarLivro();
        pessoa2.livro = livro1;
        pessoa2.verificarLivro();
        System.out.println("----------------------");

        //CRIANDO O OBJETO DA CLASSE PROFESSOR E APRESENTANDO
        Professor prof1 = new Professor();
        prof1.nome = "Alexandre";
        prof1.disciplina = "Java";
        prof1.apresentar();
        System.out.println("------------------------");

        //RELACIONANDO OBJETO PROFESSOR A LIVRO
        prof1.livro = livro1;
        prof1.relacionarLivro();
        System.out.println("----------------------");
    }
}
