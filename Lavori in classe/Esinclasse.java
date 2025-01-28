class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public void stampaDettagli() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
    }

}

public class Esinclasse {

    public static void main(String[] args) {

        Veicolo veicolo = new Veicolo ("fiat", "500");

        veicolo.stampaDettagli();
        
    }
    
}