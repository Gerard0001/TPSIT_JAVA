public class EsArr2 {
    public static void main(String[] args) {
        // Creazione dell'array
        int[] array = {15, 22, 8, 31, 42, 10, 5, 18, 35};

        // Variabili per la somma, il minimo e il massimo
        int somma = 0;
        int minimo = array[0];
        int massimo = array[0];

        // Ciclo per calcolare la somma, trovare il minimo e il massimo
        for (int i = 0; i < array.length; i++) {
            somma += array[i]; // Calcolo della somma
            if (array[i] < minimo) {
                minimo = array[i]; // Trovare il minimo
            }
            if (array[i] > massimo) {
                massimo = array[i]; // Trovare il massimo
            }
        }

        // Calcolo della media (approssimata come intero)
        int media = somma / array.length;

        // Stampa dei risultati
        System.out.println("Media: " + media);
        System.out.println("Minimo: " + minimo);
        System.out.println("Massimo: " + massimo);
    }
}