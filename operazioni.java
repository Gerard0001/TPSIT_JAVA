
public class operazioni {
    public static void main(String[] args) {
        // Verifica se ci sono numeri forniti come argomenti dalla linea di comando
        if (args.length == 0) {
            System.out.println("Devi inserire almeno un numero dalla linea di comando.");
            return;
        }

        // Inizializza le variabili al primo numero e fai la conversione dentro il ciclo
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        // Ciclo per elaborare i numeri forniti dalla linea di comando
        for (String arg : args) {
            double num = Double.parseDouble(arg);
            sum += num;

            // Aggiorna il massimo e il minimo
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Calcolo e stampa dei risultati
        double media = sum / args.length;
        System.out.println("Somma: " + sum);
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);
    }
}

