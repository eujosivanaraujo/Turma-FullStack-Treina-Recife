package Aula04;

public class Gerente extends Funcionario {

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 1.2;
    }

}
