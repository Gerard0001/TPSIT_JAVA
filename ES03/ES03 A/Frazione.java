public class Frazione {
    private int numeratore;
    private int denominatore;

    // Costruttore
    public Frazione(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        numeratore = num;
        denominatore = den;
    }

    // Metodo per moltiplicare
    public Frazione moltiplica(Frazione f) {
        int num = numeratore * f.numeratore;
        int den = denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    // Metodo per sottrarre
    public Frazione sottrai(Frazione f) {
        int num = numeratore * f.denominatore - f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    // Metodo per sommare
    public Frazione somma(Frazione f) {
        int num = numeratore * f.denominatore + f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    // Metodo per dividere
    public Frazione dividi(Frazione f) {
        int num = numeratore * f.denominatore;
        int den = denominatore * f.numeratore;
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore del risultato non può essere zero.");
        }
        return new Frazione(num, den);
    }

    // Metodo per ottenere la rappresentazione della frazione
    public String rappresenta() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        // Esempi di utilizzo delle frazioni
        Frazione f1 = new Frazione(3, 4);
        Frazione f2 = new Frazione(2, 5);
        
        Frazione risultatoMoltiplicazione = f1.moltiplica(f2);
        System.out.println("Risultato della moltiplicazione: " + risultatoMoltiplicazione.rappresenta());
        
        Frazione f3 = new Frazione(3, 4);
        Frazione f4 = new Frazione(1, 2);
        Frazione risultatoSottrazione = f3.sottrai(f4);
        System.out.println("Risultato della sottrazione: " + risultatoSottrazione.rappresenta());
        
        Frazione f5 = new Frazione(1, 2);
        Frazione f6 = new Frazione(1, 3);
        Frazione risultatoSomma = f5.somma(f6);
        System.out.println("Risultato della somma: " + risultatoSomma.rappresenta());
        
        Frazione f7 = new Frazione(3, 4);
        Frazione f8 = new Frazione(2, 5);
        Frazione risultatoDivisione = f7.dividi(f8);
        System.out.println("Risultato della divisione: " + risultatoDivisione.rappresenta());
    }
}
