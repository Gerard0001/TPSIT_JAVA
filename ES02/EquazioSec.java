package ES02;
public class EquazioSec {
    public static void main(String[] args) {
        // Controllo se sono stati forniti esattamente tre argomenti
        if (args.length != 3) {
            System.out.println("Devi fornire esattamente tre coefficienti (a, b, c).");
            return;
        }

        // Parsing dei coefficienti da String a double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Calcolo del discriminante
        double D = b * b - 4 * a * c;

        // Stampa dell'equazione
        System.out.printf("Equazione: %.1fx² + %.1fx + %.1f = 0%n", a, b, c);

        // Verifica le soluzioni in base al discriminante
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Soluzioni reali e diverse: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.printf("Soluzione reale coincidente: x = %.2f%n", x);
        } else {
            System.out.println("Le soluzioni sono complesse.");
        }
    }
}
