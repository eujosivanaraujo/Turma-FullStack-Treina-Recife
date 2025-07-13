package Aula6;

public class Fruta {

    private String fruta;

    public Fruta(String fruta) {
        this.fruta = fruta;
    }

    public void exibirLista() {
        System.out.println(fruta);
    }

    public String getFruta() {
        return fruta;
    }



    public void setFruta(String fruta) {
        this.fruta = fruta;
    }


}