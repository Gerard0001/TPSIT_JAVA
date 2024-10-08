package ES03;

public class FrazioneMolt {
    private int numeratore;
    private int denominatore;

    public FrazioneMolt(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        numeratore = num;
        denominatore = den;
    }

    public FrazioneMolt moltiplica(FrazioneMolt f) {
        int num = numeratore * f.numeratore;
        int den = denominatore * f.denominatore;
        return new FrazioneMolt(num, den);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        FrazioneMolt f1 = new FrazioneMolt(3, 4);
        FrazioneMolt f2 = new FrazioneMolt(2, 5);

        FrazioneMolt risultato = f1.moltiplica(f2);
        System.out.println("Risultato della moltiplicazione: " + risultato);
    }
}
