public class EsercizioArr {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione dell'array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Stampa degli elementi dell'array su una sola riga
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) { // Aggiunge uno spazio tra i numeri, tranne dopo l'ultimo
                System.out.print(" ");
            }
        }
    }
}
