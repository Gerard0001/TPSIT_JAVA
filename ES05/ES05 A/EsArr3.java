import java.util.Scanner;

public class EsArr3 {
    public static void main(String[] args) {
        // Dichiarazione dell'array
        String[] nomi = {"Alice", "Bob", "Carol", "David", "Eve"};

        // Creazione dello Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente di inserire un nome
        System.out.print("Inserisci un nome: ");
        String nomeInserito = scanner.nextLine();

        // Variabile per contare i match
        int count = 0;

        // Ricerca del nome nell'array
        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].equals(nomeInserito)) {
                count++; // Incrementa il contatore se il nome è trovato
            }
        }

        // Stampa del risultato
        if (count > 0) {
            System.out.println("Il nome è presente nell'array.");
        } else {
            System.out.println("Il nome non è presente nell'array.");
        }
    }
}