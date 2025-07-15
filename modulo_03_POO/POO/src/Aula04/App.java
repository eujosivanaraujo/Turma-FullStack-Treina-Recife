package Aula04;
public class App {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rodrigo");
        cachorro.dormir();
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.setNome("Josivan");
        gato.dormir();
        gato.emitirSom();

        Carro carro = new Carro();
        carro.setModelo("FIAT");
        carro.setCapacidade(4);
        carro.exibirInfo();
        carro.mover();

        Barco barco = new Barco();
        barco.setModelo("Lancha");
        barco.setCapacidade(10);
        barco.exibirInfo();
        barco.mover();

        Gerente gerente = new Gerente();
        gerente.setNome("Josivan");
        gerente.setSalarioBase(3.000);
        System.out.printf("O salário final do Gerente " + gerente.getNome() + " é de: R$ %.3f\n", gerente.calcularSalarioFinal());

        Estagiario estagiario = new Estagiario();
        estagiario.setNome("Rodrigo");
        estagiario.setSalarioBase(1.000);
        System.out.printf("O salário final do Estagiário " + estagiario.getNome() + " é de: R$ %.3f\n", estagiario.calcularSalarioFinal());
        
        System.out.println("------------------------------------------------------");
    }
}