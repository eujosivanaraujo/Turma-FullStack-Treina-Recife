package Aula3;

public class Triangulo extends FormaGeometrica {

    private int lado1;
    private int lado2;
    private int lado3;
    private int numeroDeLados;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.numeroDeLados = 3;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void CalcularPerimetro() {
        double triangulo = lado1 + lado2 + lado3;
        System.out.println("Perimetro do Triângulo: " + triangulo);
    }

}
