package Aula04;

public abstract class Transporte {

    private String modelo;
    private int capacidade;

    public void exibirInfo() {
        System.out.println("Modelo: " + getModelo() + " | Capacidade: " + getCapacidade());
    }
    public abstract void mover();


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }



}
