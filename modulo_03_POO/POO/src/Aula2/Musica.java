package Aula2;

public class Musica {

    private String titulo;
    private String artista;
    private int duracao; // em segundos

    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getArtista() {
        return artista;
    }


    public void setArtista(String artista) {
        this.artista = artista;
    }


    public int getDuracao() {
        return duracao;
    }


    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração Inválida!");
        }
    }

    public void exibirInfo() {
        int minutos = duracao / 60;
        int segundo = duracao % 60;
        System.out.printf("Musica: %s - %s (%dm %ds)%n", titulo, artista, minutos, segundo);
        System.out.println("-----------------------------------------------");
    }
}
