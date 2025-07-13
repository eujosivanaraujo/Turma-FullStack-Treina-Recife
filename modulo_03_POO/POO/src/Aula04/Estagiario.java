package Aula04;

    public class Estagiario extends Funcionario {

        @Override
        public double calcularSalarioFinal() {
            return getSalarioBase() * 1.1;
        }

    }
