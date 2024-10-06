package ES02;

import java.util.Scanner;

public class equazioni {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il primo coeffinciente: ");
        int a = input.nextInt();

        System.out.println("inserisci il secondo coeffinciente: ");
        int b = input.nextInt();

        System.out.println("inserisci il terzo coeffinciente: ");
        int c = input.nextInt();

        input.close();

        int delta = (b * b - 4 * a * c)^(1/2);

        int x1, x2;

        if (delta > 0) {
            
            x1 = (-b + delta) / (2*a);
            x2 = (-b - delta) / (2*a);

            System.out.printf("risultato x1: %d%n", x1);
            System.out.printf("risultato x2: %d%n", x2);

        } else if (delta >=0) {

            x1 = (-b + delta) / (2*a);

           System.out.printf("risultato x1: %d%n", x1);


        } else {

            System.out.printf("Equazione Impossibile...");

        }



    }

}

