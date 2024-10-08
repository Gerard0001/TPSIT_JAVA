package ES03;

public class FrazioneSomma {

    private int numeratore;
    private int denominatore;

    public FrazioneSomma(int num, int den) {
        numeratore = num;
        denominatore = den;
    }
    
    // Metodi
    public int getNumeratore() {
        return numeratore;
    }
    
    public int getDenominatore() {
        return denominatore;
    }
    
    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }
    
    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }
    
    public FrazioneSomma somma(FrazioneSomma f) {
        int num = numeratore * f.denominatore + f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new FrazioneSomma(num, den);
    }
      
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    public static void main(String[] args) {
        FrazioneSomma f1 = new FrazioneSomma(1, 2);
        FrazioneSomma f2 = new FrazioneSomma(1, 3);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f1 + f2 = " + f1.somma(f2));
    }
}




 