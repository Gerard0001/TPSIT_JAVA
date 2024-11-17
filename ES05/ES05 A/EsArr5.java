public class EsArr5 {
    public static void main(String[] args) {
        // Creazione e inizializzazione del primo array
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Creazione del secondo array di dimensione 5
        int[] array2 = new int[5];

        // Copia dei primi 5 elementi di array1 in array2 usando System.arraycopy()
        System.arraycopy(array1, 0, array2, 0, 5);

        // Stampa del contenuto di array2
        System.out.print("Contenuto di array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(" \n");

    }
}