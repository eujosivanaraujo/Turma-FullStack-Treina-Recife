package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import constants.StatusProjeto;
import constants.StatusUsuario;

public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private LocalDate dataDeNascimento;
    private StatusUsuario status;
    private List<Tarefas> tarefas = new ArrayList<>();

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Data de Nasacimento: " + getDataDeNascimento());
        System.out.println("----------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataConclusao) {
        this.dataDeNascimento = dataConclusao;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }
}
