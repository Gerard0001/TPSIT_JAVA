import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci l'operazione (-a per somma, -m per moltiplicazione): ");
        String operazione = scanner.nextLine();

        System.out.print("Inserisci il valore da sommare o moltiplicare: ");
        String valoreArgomento = scanner.nextLine();
        
        int valore = 0;

        for (int i = 0; i < valoreArgomento.length(); i++) {
            valore = valore * 10 + (valoreArgomento.charAt(i) - '0');
        }

        int[] vet1 = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = rand.nextInt(21);
        }

        System.out.println("Array originale:");
        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();

        if (operazione.length() == 2 && operazione.charAt(0) == '-' && operazione.charAt(1) == 'a') {
            for (int i = 0; i < vet1.length; i++) {
                vet1[i] += valore;
            }
            System.out.println("Array dopo somma:");
        } else if (operazione.length() == 2 && operazione.charAt(0) == '-' && operazione.charAt(1) == 'm') {
            for (int i = 0; i < vet1.length; i++) {
                vet1[i] *= valore;
            }
            System.out.println("Array dopo moltiplicazione:");
        } else {
            System.out.println("Errore: L'operazione deve essere '-a' (somma) o '-m' (moltiplicazione).");
        }

        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}