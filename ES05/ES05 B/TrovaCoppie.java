import java.util.Scanner;

public class TrovaCoppie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = {5, 8, 7, 3, 6, 4};

        System.out.println("Inserire un numero: ");
        int target = input.nextInt();

        input.close();

        System.out.println("Coppie trovate: " );

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + ", " + array[j]);
                    
                }
            }
        }
    }
}