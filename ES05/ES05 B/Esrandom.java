import java.util.Scanner;

public class Esrandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Dichiarazione dello Scanner

        int[] array = {3, 14, 29, 31, 40, 56, 66, 84, 90, 100};

        int NumRandom = 56;

        System.out.println("Indovina il numero selezionato in una posizione casuale dell'array!");
        System.out.println("Inserire il numero: ");
        int tentativo = input.nextInt();

        input.close();

        if (tentativo > NumRandom) {

            System.out.println("Il numero inserito è maggiore del numero che ho scelto.");

        } else {

            if (tentativo < NumRandom) { 

            System.out.println("Il numero inserito è minore del numero che ho scelto.");

            }

            else {

                System.out.println("Bravo, hai indovinato il numero che ho scelto.");

            }

        }
    }
}
