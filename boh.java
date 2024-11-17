import java.util.Scanner;

public class boh {
    public static void main(String[] args) {
        // Creazione dell'oggetto Scanner per leggere l'input
        Scanner scanner = new Scanner(System.in);

        // Lettura della prima stringa
        System.out.print("Inserisci la prima stringa: ");
        String str1 = scanner.nextLine();

        // Lettura della seconda stringa
        System.out.print("Inserisci la seconda stringa: ");
        String str2 = scanner.nextLine();

        scanner.close();
    }
}