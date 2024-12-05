public class Auto {
    String modello;
    int posti;

    Auto(String modello, int posti) {
        this.modello = modello;
        this.posti = posti;
    }

    public static void main(String[] args) {
        Auto[] automobili = {
            new Auto("Fiat 500", 4),
            new Auto("Ford Galaxy", 7),
            new Auto("Toyota Sienna", 7),
            new Auto("Volkswagen Touran", 7),
            new Auto("Opel Corsa", 5)
        };

        System.out.println("Auto con 7 posti:");
        for (Auto auto : automobili) {
            if (auto.posti == 7) {
                System.out.println(auto.modello);
            }
        }
    }
}