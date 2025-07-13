package Aula2;

public class Produto {

    //ATRIBUTOS
    private String nome;
    private double preco;
    private int quantidade;

    //CONSTRUTOR COM PARÂMETRO
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("preço: R$" + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("--------------------------------");
    }

    public double calculoTotal(int quantidade, double preco) {
        double valorTotal;
        valorTotal = quantidade * preco;
        return valorTotal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
