package Aula04;

public abstract class Animal {

    private String nome;

    public void dormir() {
        System.out.println(getNome() + " Está dormindo ");
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
