class Animale {
    public void verso() {
        System.out.println("L'animale emette un verso");
    }
}

class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("Il cane abbaia");
        super.verso(); 
    }
}

public class Esercizio3 {
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.verso(); 
    }
}