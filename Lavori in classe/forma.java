class Forma {

    private String nome;
    private int raggio = 5;

    public Forma(String nome) {
        this.nome = nome;
    }

     public int getRaggio() {
        return raggio;
    }
    public void setRaggio(int raggio) {
        this.raggio = raggio;
    } 

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcolaArea() {
        return 0;
    }

    
    public float calcolaPerimetro() {
        return 0;
    }

    
    public void descrizione() {
        System.out.println("Forma: " + nome);
    }

}
class Cerchio extends Forma {

    private float raggio;

    public Cerchio(float raggio){

        this.raggio = raggio;

    }

    @Override

    public float calcolaArea() {

        return 3.14 * raggio * raggio;

    }


}

public class forma {
    public static void main(String[] args) {

        Forma forma = new Forma("cerchio");

        forma.descrizione();
    }
}