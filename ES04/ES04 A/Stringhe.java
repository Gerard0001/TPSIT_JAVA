import java.util.Scanner;

public class Stringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("La lunghezza della stringa è: " + length);
        
        if (length > 0) {

            int centerIndex = length / 2;

            if (length % 2 == 0) {

                System.out.println("I caratteri centrali sono: '" + input.charAt(centerIndex - 1) + "' e '" + input.charAt(centerIndex) + "'");
            } else {
                System.out.println("Il carattere centrale è: '" + input.charAt(centerIndex) + "'");
            }
        }

        if (length > 0) {
            String capitalized = Character.toUpperCase(input.charAt(0)) + input.substring(1);
            System.out.println("Stringa con l'iniziale maiuscola: " + capitalized);
        }

        if (length >= 4) {

            String substring = input.substring(0, 4);
            System.out.println("Sottostringa dal primo al quarto carattere: " + substring);
        } 
        else {
            System.out.println("La stringa è troppo corta per estrarre una sottostringa da 1 a 4.");
        }

        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());

        System.out.println("Stringa in minuscolo: " + input.toLowerCase());


        if (isPalindrome(input)) {

            System.out.println("La stringa è un palindromo.");
        } 
        else {
            System.out.println("La stringa NON è un palindromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {

        String cleaned = str.replaceAll("\\s+", "").toLowerCase(); // Rimuoviamo gli spazi e facciamo tutto minuscolo
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}