public class Studente {

    private String nome;
    private String cognome;
    private double mediaVoti;

    public Studente() {

        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.mediaVoti = 0.0;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        if (nome.length() == 0) { 

            System.out.println("Errore: nome non valido.");
            this.nome = "Sconosciuto";

        } else {

            this.nome = nome;
        }
    }

    public String getCognome() {

        return cognome;
    }

    public void setCognome(String cognome) {

        if (cognome.length() == 0) { 

            System.out.println("Errore: cognome non valido.");
            this.cognome = "Sconosciuto";

        } else {

            this.cognome = cognome;
        }
    }

    public double getMediaVoti() {

        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {

        if (mediaVoti < 0 || mediaVoti > 10) { 

            System.out.println("Errore: media voti non valida. Impostata a 0.0.");
            this.mediaVoti = 0.0;

        } else {

            this.mediaVoti = mediaVoti;
        }
    }

    public void stampaDettagli() {

        System.out.println("Studente: " + nome + " " + cognome + "\nMedia voti: " + mediaVoti);
    }

  
    public static void main(String[] args) {
       
        Studente studente = new Studente();

        studente.setNome("Mario"); 
        studente.setCognome("Rossi");
        studente.setMediaVoti(3); 

        studente.stampaDettagli();
    }
}
