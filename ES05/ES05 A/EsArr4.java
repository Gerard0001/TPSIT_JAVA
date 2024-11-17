public class EsArr4 {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione dell'array
        int[] array = {10, 20, 30, 40, 50};

        // Inversione dell'array con ciclo semplice
        for (int i = 0; i < array.length / 2; i++) {
            // Scambia gli elementi senza l'uso di variabili temporanee
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Stampa dell'array invertito
        System.out.print("Array invertito: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.print(" \n");
    }
}


