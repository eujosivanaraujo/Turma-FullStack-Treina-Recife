package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import constants.StatusProjeto;

public class Projeto {

    private String nome;
    private String descricao;
    private LocalDate dataDeInicio;
    private LocalDate dataDeConclusao;
    private StatusProjeto status;
    private Usuario responsavel;
    private List<Tarefas> tarefas = new ArrayList<>();

    public void exibirInfo() {
        System.out.println();
        System.out.println("Nome do projeto: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data de inicio: " + getDataDeInicio());
        System.out.println("Data de conclusão: " + getDataDeConclusao());
        System.out.println("Responsavel: " + responsavel.getNome());
        System.out.println("--------------------------------------");
        
        if (!tarefas.isEmpty()) {
            System.out.println("Tarefas atribuidas ao projeto: ");
            System.out.println();

            for (Tarefas tarefa : tarefas) {
                
                System.out.println("Titulo: " + tarefa.getTitulo());
                System.out.println("Data de Criação: " + tarefa.getDataDeCriacao());
                System.out.println("Data de Conclusão " + tarefa.getDataDeConclusao());
                System.out.println("Status de tarefas: " + tarefa.getStatus());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println("----------------------------------------------");
            }
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }
    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }
    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }
    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }
    public StatusProjeto getStatus() {
        return status;
    }
    public void setStatus(StatusProjeto status) {
        this.status = status;
    }
    public Usuario getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
    public List<Tarefas> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }

    
}
