package Aula3;

public class App {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Josivan");
        pessoa1.setIdade(33);
        pessoa1.exibirDados();

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula("123456");
        aluno1.setNome("Josivan");
        aluno1.setIdade(33);
        aluno1.exibirDados();

        Animal c1 = new Cachorro();
        c1.fazerSom();

        Animal g1 = new Gato();
        g1.fazerSom();

        Mensagem texto = new MensagemDeTexto();
        texto.Enviar();

        Mensagem email = new MensagemDeEmail();
        email.Enviar();

        Transporte bike = new Bicicleta();
        bike.Mover();

        Transporte carro = new Carro();
        carro.Mover();

        Transporte Aviao = new Aviao();
        Aviao.Mover();

        Quadrado quadrado = new Quadrado(5);
        quadrado.CalcularPerimetro();

        Triangulo triangulo = new Triangulo(10, 10, 10);
        triangulo.CalcularPerimetro();
    }
}
