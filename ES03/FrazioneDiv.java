package ES03;


public class FrazioneDiv {
    private int numeratore;
    private int denominatore;

    public FrazioneDiv(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        numeratore = num;
        denominatore = den;
    }

    public FrazioneDiv dividi(FrazioneDiv f) {
        int num = numeratore * f.denominatore;
        int den = denominatore * f.numeratore;
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore del risultato non può essere zero.");
        }
        return new FrazioneDiv(num, den);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        FrazioneDiv f1 = new FrazioneDiv(3, 4);
        FrazioneDiv f2 = new FrazioneDiv(2, 5);

        FrazioneDiv risultato = f1.dividi(f2);
        System.out.println("Risultato della divisione: " + risultato);
    }
}