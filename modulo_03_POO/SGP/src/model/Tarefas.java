package model;

import java.time.LocalDate;
import java.util.PriorityQueue;
import constants.Prioridade;
import constants.StatusTarefa;

public class Tarefas {
    private String titulo;
    private LocalDate dataDeCriacao;
    private LocalDate dataDeConclusao;
    private StatusTarefa status;
    private Prioridade prioridade;

    public void exibirInfo() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Data de criação: " + getDataDeCriacao());
        System.out.println("Data de conclusão: " + getDataDeConclusao());
        System.out.println("Status da tarefa: " + getStatus());
        System.out.println("Prioridade: " + getPrioridade());
        System.out.println("-------------------------------------------");

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDate dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    
}
