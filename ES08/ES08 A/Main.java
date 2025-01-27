class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void stampaDettagli() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Numero di porte: " + numeroPorte);
    }
}

class Moto extends Veicolo {
    private boolean haSidecar;

    public Moto(String marca, String modello, boolean haSidecar) {
        super(marca, modello);
        this.haSidecar = haSidecar;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Ha sidecar: " + (haSidecar ? "Sì" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "Panda", 5);
        Moto moto = new Moto("Harley-Davidson", "Softail", false);

        System.out.println("Dettagli Auto:");
        auto.stampaDettagli();

        System.out.println("\nDettagli Moto:");
        moto.stampaDettagli();
    }
}