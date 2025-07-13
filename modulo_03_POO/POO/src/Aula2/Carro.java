package Aula2;

public class Carro {
    //ATRIBUTOS
    private String marca;
    private int velocidade; 

    public void exibirInfo() {
        System.out.println("Exibindo informações do carro:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("-------------------------------");
    }

    public String getMarca() {
        return marca;
    }   
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void acelerar(int valor) {
        velocidade += valor;
    }
    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    public int getVelocidade() {
        return velocidade;
    }
}
