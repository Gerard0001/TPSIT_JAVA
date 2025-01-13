public class Rettangolo {

    private int larghezza;
    private int altezza;

    public int getLarghezza() {

        return larghezza;

    }

        public void setLarghezza(int larghezza) {

        if (larghezza > 0) {

            this.larghezza = larghezza;

        } else {

            this.larghezza = 1;

            System.out.println("Errore: larghezza non valida. Impostato a 1.");
        }
    } 

    public int getAltezza() {

        return altezza;
    }

    public void setAltezza(int altezza) {

        if (altezza > 0) {

            this.altezza = altezza;

        } else {

            this.altezza = 1;
            System.out.println("Errore: altezza non valida. Impostato a 1.");
        }
    }

    public int calcolaArea() {
        return larghezza * altezza;
    }

    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setLarghezza(-5);  
        rettangolo.setAltezza(-10);   

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}
