import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import constants.Prioridade;
import constants.StatusProjeto;
import constants.StatusTarefa;
import constants.StatusUsuario;
import model.Projeto;
import model.Tarefas;
import model.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Tarefas tarefaUm = new Tarefas();
        tarefaUm.setTitulo("Criando banco de dados");
        tarefaUm.setStatus(StatusTarefa.CONCLUIDA);
        tarefaUm.setPrioridade(Prioridade.ALTA);
        tarefaUm.setDataDeCriacao(LocalDate.of(2025, 5, 1));
        tarefaUm.setDataDeConclusao(LocalDate.of(2025, 5, 30));
        
        Tarefas tarefaDois = new Tarefas();
        tarefaDois.setTitulo("Criando interface de login");
        tarefaDois.setStatus(StatusTarefa.CONCLUIDA);
        tarefaDois.setPrioridade(Prioridade.ALTA);
        tarefaDois.setDataDeCriacao(LocalDate.of(2025, 6, 2));
        tarefaDois.setDataDeConclusao(LocalDate.of(2025, 6, 30));

        Tarefas tarefaTres = new Tarefas();
        tarefaTres.setTitulo("Configurar ambiente de testes e homologação");
        tarefaTres.setStatus(StatusTarefa.FAZENDO);
        tarefaTres.setPrioridade(Prioridade.ALTA);
        tarefaTres.setDataDeCriacao(LocalDate.of(2025, 7, 1));
        tarefaTres.setDataDeConclusao(LocalDate.of(2025, 7, 30));

        Tarefas tarefaQuatro = new Tarefas();
        tarefaQuatro.setTitulo("Implementar API REST para autenticação");
        tarefaQuatro.setStatus(StatusTarefa.PENDENTE);
        tarefaQuatro.setPrioridade(Prioridade.ALTA);
        tarefaQuatro.setDataDeCriacao(LocalDate.of(2025, 7, 10));
        tarefaQuatro.setDataDeConclusao(LocalDate.of(2025, 8, 10));

        List<Tarefas> tarefas = new ArrayList<>();
        tarefas.add(tarefaUm);
        tarefas.add(tarefaDois);
        tarefas.add(tarefaTres);
        tarefas.add(tarefaQuatro);

        Usuario responsavel =  new Usuario();
        System.out.println("--- USUÁRIO ---");
        responsavel.setNome("Josivan Araújo");
        responsavel.setCpf("123.456.789-10");
        responsavel.setEmail("aluno@gmail.com");
        responsavel.setStatus(StatusUsuario.ATIVO);
        responsavel.setDataDeNascimento(LocalDate.of(1991, 8, 6));

        responsavel.exibirInfo();

        Projeto projeto = new Projeto();
        projeto.setNome("Transformação Digital");
        projeto.setResponsavel(responsavel);
        projeto.setStatus(StatusProjeto.ATIVO);
        projeto.setDescricao("Projeto de Tecnologia do zero ao FullSatck.");
        projeto.setDataDeInicio(LocalDate.of(2025, 5, 29));
        projeto.setDataDeConclusao(LocalDate.of(2025, 12, 31));
        projeto.setTarefas(tarefas);

        projeto.exibirInfo();

    }
}
