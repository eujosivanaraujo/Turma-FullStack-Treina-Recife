package Aula6;

public class Nome {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nome(String nome) {
        this.nome = nome;
    }

    public void exibirLista() {
        System.out.println(nome);
    }



}
