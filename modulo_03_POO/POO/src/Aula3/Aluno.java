package Aula3;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {
        
    }

     public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("Exibindo dados de Aluno:"); 
        System.out.println("Matricula: " + matricula);
        System.out.println("-------------------------");
        super.exibirDados();
    }
}
