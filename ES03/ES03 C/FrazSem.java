public class FrazSem {

    private int numeratore;
    private int denominatore;

    public FrazSem() {
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public FrazSem(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = num;
        this.denominatore = den;
        riduci();  
    }

    public FrazSem reciproco() {

        return new FrazSem(denominatore, numeratore);
    }

    public int confronta(FrazSem f) {

        int confronto = this.numeratore * f.denominatore - this.denominatore * f.numeratore;

        if (confronto > 0) {

            return 1;  
        }
         else if (confronto < 0) {

            return -1; 
        } 
        else {
            return 0;  
        }
    }

    public double toDouble() {

        return (double) numeratore / denominatore;
    }

    public String toFrazioneMista() {

        if (numeratore < denominatore) {

            return rappresenta();  

        }

        int intero = numeratore / denominatore;
        int nuovoNumeratore = numeratore % denominatore;

        if (nuovoNumeratore == 0) {

            return String.valueOf(intero);  
        } 
        else {
            return intero + " " + nuovoNumeratore + "/" + denominatore;
        }
    }

    public String rappresenta() {

        return numeratore + "/" + denominatore;

    }

    private void riduci() {

        int gcd = mcd(numeratore, denominatore);
        numeratore /= gcd;
        denominatore /= gcd;
    }

    private int mcd(int a, int b) {

        if (b == 0) {

            return Math.abs(a);
        }
        return mcd(b, a % b);
    }

    public static void main(String[] args) {

        FrazSem f0 = new FrazSem();
        System.out.println("Frazione di default: " + f0.rappresenta());

        FrazSem f1 = new FrazSem(3, 4);
        System.out.println("Frazione con parametri: " + f1.rappresenta());
   
        FrazSem f2 = f1.reciproco();
        System.out.println("Reciproco di " + f1.rappresenta() + " è: " + f2.rappresenta());
     
        FrazSem f3 = new FrazSem(1, 2);
        System.out.println("Confronto tra " + f1.rappresenta() + " e " + f3.rappresenta() + ": " + f1.confronta(f3)); // Dovrebbe restituire 1
        System.out.println("Confronto tra " + f3.rappresenta() + " e " + f1.rappresenta() + ": " + f3.confronta(f1)); // Dovrebbe restituire -1
        System.out.println("Confronto tra " + f3.rappresenta() + " e " + new FrazSem(1, 2).rappresenta() + ": " + f3.confronta(new FrazSem(1, 2))); 

        System.out.println("Valore decimale di " + f1.rappresenta() + ": " + f1.toDouble());

        FrazSem f4 = new FrazSem(7, 3);
        System.out.println("Frazione mista di " + f4.rappresenta() + ": " + f4.toFrazioneMista());

        FrazSem f5 = new FrazSem(4, 3);
        System.out.println("Frazione mista di " + f5.rappresenta() + ": " + f5.toFrazioneMista());

        FrazSem f6 = new FrazSem(5, 5);
        System.out.println("Frazione mista di " + f6.rappresenta() + ": " + f6.toFrazioneMista());
    }
}