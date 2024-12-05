public class Tabella {
    public static void main(String[] args) {
        int[][] tabella = new int[12][12];

        // Creazione della tabella pitagorica
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tabella[i][j] = (i + 1) * (j + 1);
            }
        }

        // Stampa della tabella pitagorica usando solo il ciclo foreach
        System.out.println("Tabella pitagorica:");
        for (int[] riga : tabella) {
            for (int valore : riga) {
                System.out.print(valore + " ");
            }
            System.out.println();
        }
    }
}
