import java.util.Scanner;

public class Stringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Legge due stringhe e verifica se sono uguali (ignorando maiuscole/minuscole)
        System.out.println("Inserisci la prima stringa:");
        String string1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String string2 = scanner.nextLine();

        // Controlla se le due stringhe siano uguali
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Le due stringhe sono uguali (ignorando maiuscole/minuscole).");
        } else {
            System.out.println("Le due stringhe sono diverse.");
        }

        // Legge una terza stringa e stampa i primi 5 caratteri
        System.out.println("Inserisci una stringa per visualizzare i primi 5 caratteri:");
        String string3 = scanner.nextLine();
        
        if (string3.length() >= 5) {
            System.out.println("I primi 5 caratteri sono: " + string3.substring(0, 5));
        } else {
            System.out.println("La stringa inserita è troppo corta. Ha solo " + string3.length() + " caratteri.");
        }

        // Legge una quarta stringa e stampa gli ultimi 5 caratteri
        System.out.println("Inserisci un'altra stringa per visualizzare gli ultimi 5 caratteri:");
        String string4 = scanner.nextLine();
        
        if (string4.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri sono: " + string4.substring(string4.length() - 5));
        } else {
            System.out.println("La stringa inserita è troppo corta. Ha solo " + string4.length() + " caratteri.");
        }

        // Legge una frase e stampa la parola più lunga
        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();
        String[] parole = frase.split("\\s+"); // Divide la frase in parole usando gli spazi come delimitatori

        String parolaPiuLunga = "";
        for (String parola : parole) {
            
            if (parola.length() > parolaPiuLunga.length()) {

                parolaPiuLunga = parola;
            }
        }

        System.out.println("La parola più lunga è: " + parolaPiuLunga);

        // Stampa ciascuna parola su una riga separata
        System.out.println("Le parole della frase sono:");

        for (String parola : parole) {

            System.out.println(parola);
        }

        scanner.close();
    }
}
