#include <stdio.h>
#include <unistd.h> // Per fork()
#include <math.h> // Per sqrt()

int main() {
    // Inizializzazione dei cateti
    int cateto1 = 3;
    int cateto2 = 4;

    // Creazione del processo figlio
    pid_t pid = fork();

    if (pid < 0) {
        // Errore nella creazione del processo figlio
        printf("Errore nella creazione del processo figlio");
        return 1;
    } else if (pid == 0) {
        // Codice del processo figlio
        printf("[Figlio] Calcolo del perimetro...\n");
        
        int ipotenusa = (int)sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        int perimetro = cateto1 + cateto2 + ipotenusa;
        
        printf("[Figlio] Il perimetro del triangolo è: %d\n", perimetro);
    } else {
        // Codice del processo padre
        printf("[Padre] Calcolo dell'area...\n");

        int area = (cateto1 * cateto2) / 2;
        printf("[Padre] L'area del triangolo è: %d\n", area);
    }

    return 0;
}