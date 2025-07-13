package Aula2;

public class Aluno {

    //ATRIBUTOS
    private String nome;
    private int idade;
    private String curso;

    //CONSTRUTOR COM PARÂMETRO
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
     public void setidade(int idade) {
            this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //MÉTODOS
    public String exibirMensagem() 
    {
        return "O aluno " + getNome() + " está matriculado no curso de " + getCurso();
    } 

    public void exibirDetalhes() {
        if (this.idade >= 0 && this.idade <= 120) {
            this.idade = idade;
            
        } else {
              System.out.println("Idade inválida.");
        }
    
        System.out.println("Exibindo detalhes do aluno:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println(this.exibirMensagem());
        System.out.println("----------------------------------------------");
    }
}
