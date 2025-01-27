class Dipendente {
    private String nome;
    private double stipendioBase;

    public Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Base: " + stipendioBase);
    }
}

class Manager extends Dipendente {
    private double bonus;

    public Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);  
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void stampaStipendio() {

        double stipendioTotale = getStipendioBase() + bonus;  
        System.out.println("Nome: " + getNome() + ", Stipendio Totale: " + stipendioTotale);
    }
}
