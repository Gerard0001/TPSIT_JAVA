package ES03;

public class FrazioneSott {
    private int numeratore;
    private int denominatore;

    public FrazioneSott(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        numeratore = num;
        denominatore = den;
    }

    public FrazioneSott sottrai(FrazioneSott f) {
        int num = numeratore * f.denominatore - f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new FrazioneSott(num, den);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        FrazioneSott f1 = new FrazioneSott(3, 4);
        FrazioneSott f2 = new FrazioneSott(1, 2);

        FrazioneSott risultato = f1.sottrai(f2);
        System.out.println("Risultato della sottrazione: " + risultato);
    }
}