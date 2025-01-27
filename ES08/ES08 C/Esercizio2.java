import java.util.Scanner;

class AreaCerchio {
    private double raggio;

    public AreaCerchio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return 3.14 * raggio * raggio;
    }

    public double getRaggio() {
        return raggio;
    }
}

class VolumeCilindro extends AreaCerchio {
    private double altezza;

    public VolumeCilindro(double raggio, double altezza) {
        super(raggio);
        this.altezza = altezza;
    }

    public double calcolaVolume() {
        return calcolaArea() * altezza;
    }
}

class VolumeSfera extends AreaCerchio {

    public VolumeSfera(double raggio) {
        super(raggio);
    }

    public double calcolaVolume() {
        return (4.0 / 3.0) * 3.14 * getRaggio() * getRaggio() * getRaggio();
    }
}

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il raggio del cerchio: ");
        double raggio = scanner.nextDouble();

        AreaCerchio cerchio = new AreaCerchio(raggio);
        double area = cerchio.calcolaArea();
        System.out.println("Area del cerchio: " + area);

        System.out.print("Inserisci l'altezza del cilindro: ");
        double altezza = scanner.nextDouble();

        VolumeCilindro cilindro = new VolumeCilindro(raggio, altezza);
        double volumeCilindro = cilindro.calcolaVolume();
        System.out.println("Volume del cilindro: " + volumeCilindro);

        VolumeSfera sfera = new VolumeSfera(raggio);
        double volumeSfera = sfera.calcolaVolume();
        System.out.println("Volume della sfera: " + volumeSfera);

        scanner.close();
    }
}