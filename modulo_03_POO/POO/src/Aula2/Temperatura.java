package Aula2;

public class Temperatura {

    private double grauCelsius;

    public void setTemperatura( double graus) {
        if (graus >= -273.15 && graus <= 1000) {
            this.grauCelsius = graus;
        } else {
            System.out.println(("Temperatura Inválida!"));
        }
    }
    public double getTemperatura(){
        return grauCelsius;
    }
    public void exibirTemperaturarFehrenheit(){
        double fehrenheit = 9*grauCelsius/5 + 32;
        System.out.printf("Temperatura em Fehrenheit: %.2fºF%n ", fehrenheit);
        System.out.println("------------------------------------------");
    }
}
