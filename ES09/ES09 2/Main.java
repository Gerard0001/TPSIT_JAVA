abstract class Forma {
    abstract public double calcolaArea(); 
}

class Cerchio extends Forma {
    double raggio;

    Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {

        return 3.14 * raggio * raggio; 
    }
}

class Rettangolo extends Forma {
    double base;
    double altezza;

    Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}

public class Main {
    public static void main(String[] args) {

        Cerchio cerchio = new Cerchio(3);
        Rettangolo rettangolo = new Rettangolo(8, 4);

        System.out.println("Area cerchio: " + cerchio.calcolaArea());
        System.out.println("Area rettangolo: " + rettangolo.calcolaArea());
    }
}
