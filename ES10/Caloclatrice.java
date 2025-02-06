import java.util.Scanner;

public class Caloclatrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("inserisci il primo numero: ");
        int a = input.nextInt();

        System.out.println("inserisci il secondo numero: ");
        int b = input.nextInt();

        System.out.println("\necco le operazioni possibili ");
        System.out.println("1) +\n2) -\n3) *\n4) /\n");
        System.out.println("inserisci l'opzione che vuoi:");
        int scelta = input.nextInt();

        try {

            if (scelta == 1) {
                int somma = a + b;
                System.out.println("\nRisultato della somma: " + somma);
    
            } else if (scelta == 2) {
                int sott = a - b;
                System.out.println("\nRisultato della sottrazione: " + sott);
    
            } else if (scelta == 3) {
                int molt = a * b;
                System.out.println("\nRisultato della moltiplicazzione: " + molt);
    
            } else if (scelta == 4) {

                    double div = a / b;
                    System.out.println("\nRisultato della divisione: " + div);
                
            } else {
                System.out.println("\nErrore: opzione non valida.");
            }
            
        } catch (ArithmeticException e) {

            System.out.println("\nErrore matematico");
        }
    }
    
}
