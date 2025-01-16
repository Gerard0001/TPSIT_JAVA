public class Prodotto {

    private String nome;
    private double prezzo;
    private int quantità;

    public Prodotto() {
        this.nome = "Sconosciuto";
        this.prezzo = 0.0;
        this.quantità = 0;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome; 
    }

    public double getPrezzo() {

        return prezzo;
    }

    public void setPrezzo(double prezzo) {

        if (prezzo > 0) {

            this.prezzo = prezzo;

        } else {

            System.out.println("Errore: il prezzo deve essere maggiore di zero. Impostato a 0.0.");

            this.prezzo = 0.0;
        }
    }

    public int getQuantità() {

        return quantità;
    }

    public void setQuantità(int quantità) {

        if (quantità >= 0) {

            this.quantità = quantità;

        } else {

            System.out.println("Errore: la quantità deve essere maggiore o uguale a zero. Impostata a 0.");

            this.quantità = 0;
        }
    }

    // Metodo per calcolare il valore totale
    public double calcolaValoreTotale() {

        return prezzo * quantità;
    }
    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto();

        prodotto.setNome("");
        prodotto.setPrezzo(-1);
        prodotto.setQuantità(-2);

        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("Quantità: " + prodotto.getQuantità());
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());
    }
}
