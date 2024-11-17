import java.util.Arrays;

public class EsArr6 {
    public static void main(String[] args) {
        // Creazione di un array di interi di dimensione 5
        int[] array = new int[5];

        // Utilizzo di Arrays.fill() per riempire l'array con il valore 3
        Arrays.fill(array, 3);

        // Modifica manuale dei valori dell'array
        array[0] = 8;
        array[1] = 3;
        array[2] = 6;
        array[3] = 1;
        array[4] = 9;

        // Ordinamento dell'array in ordine crescente usando Arrays.sort()
        Arrays.sort(array);

        // Stampa dell'array ordinato
        System.out.print("Array ordinato: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(" \n");
    }
}
