interface Forma2D {
    double calcolaArea();
    double calcolaPerimetro();
}

interface Forma3D {
    double calcolaVolume();
    double calcolaSuperficie();
}

class Cerchio implements Forma2D {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return 3.14 * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * 3.14 * raggio;
    }
}

class Rettangolo implements Forma2D {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Sfera implements Forma3D {
    private double raggio;

    public Sfera(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaVolume() {
        return (4.0 / 3.0) * 3.14 * raggio * raggio * raggio;
    }

    @Override
    public double calcolaSuperficie() {
        return 4 * 3.14 * raggio * raggio;
    }
}

class Cuboide implements Forma3D {
    private double larghezza, altezza, profondita;

    public Cuboide(double larghezza, double altezza, double profondita) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    @Override
    public double calcolaVolume() {
        return larghezza * altezza * profondita;
    }

    @Override
    public double calcolaSuperficie() {
        return 2 * (larghezza * altezza + larghezza * profondita + altezza * profondita);
    }
}

public class Formee2 {
    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio(5);
        Rettangolo rettangolo = new Rettangolo(4, 6);
        Sfera sfera = new Sfera(3);
        Cuboide cuboide = new Cuboide(2, 4, 6);

        System.out.println("Area del cerchio: " + cerchio.calcolaArea() + ", Perimetro: " + cerchio.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea() + ", Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Volume della sfera: " + sfera.calcolaVolume() + ", Superficie: " + sfera.calcolaSuperficie());
        System.out.println("Volume del cuboide: " + cuboide.calcolaVolume() + ", Superficie: " + cuboide.calcolaSuperficie());
    }
}

