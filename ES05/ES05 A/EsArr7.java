import java.util.Arrays;

public class EsArr7 {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione del primo array
        int[] array1 = {4, 8, 15, 16};
        
        // Creazione di una copia del primo array nel secondo array
        int[] array2 = Arrays.copyOf(array1, array1.length);
        
        // Confronto dei due array e stampa del risultato
        System.out.println("I due array sono identici? " + Arrays.equals(array1, array2));
    }
}
