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


        int delta = (b*b -4*a*c)^(1/2);

        int x1 = (-b + delta)/2;
        int x2 = (-b - delta)/2;

        if (delta > 0) {

            System.out.println("risultato x1= ");
            int Rx1 = input.nextInt();


        }
        





    }

}

