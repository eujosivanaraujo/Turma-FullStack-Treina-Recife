package Aula3;

public class Quadrado extends FormaGeometrica {

    private double lado;
    private int numeroDeLados;

    public Quadrado(int lado) {
        this.numeroDeLados = 4;
        this.lado = lado;

    }

    public void CalcularPerimetro() {
        double quadrado = 4 * lado;
        System.out.println("Perimetro do Quadrado: " + quadrado);
    }

}
