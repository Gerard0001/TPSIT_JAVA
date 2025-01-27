class ElementoMultimediale {
    private String titolo;
    private String autore;

    public ElementoMultimediale(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void riproduci() {
        System.out.println("Riproduzione non disponibile");
    }
}

class Video extends ElementoMultimediale {
    public Video(String titolo, String autore) {
        super(titolo, autore);
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione video: " + getTitolo());
    }
}

class Audio extends ElementoMultimediale {
    private String qualitaAudio;

    public Audio(String titolo, String autore, String qualitaAudio) {
        super(titolo, autore);
        this.qualitaAudio = qualitaAudio;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione audio: " + getTitolo() + " in " + qualitaAudio);
    }
}

public class Esercizio4 {
    public static void main(String[] args) {
        Video video1 = new Video("Avatar", "James Cameron");
        Audio audio1 = new Audio("Imagine", "John Lennon", "Alta Qualità");

        video1.riproduci();
        audio1.riproduci();
    }
}
