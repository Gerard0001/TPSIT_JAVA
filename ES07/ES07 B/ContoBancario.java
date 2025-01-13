 public class ContoBancario {

    private double saldo;

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo >= 0) {

            this.saldo = saldo;

        } else {

            System.out.println("Errore: il saldo non può essere negativo.");

        }
    }

    public void deposita(double importo) {

        if (importo > 0) {

            saldo += importo;

        } else {

            System.out.println("Errore: l'importo del deposito deve essere positivo.");
        }
    }

    public void preleva(double importo) {

        if (importo <= saldo) {

            saldo -= importo;

        } else {

            System.out.println("Errore: saldo insufficiente per il prelievo.");
        }
    }

    public static void main(String[] args) {

        ContoBancario conto = new ContoBancario();
    
        System.out.println("Saldo iniziale: " + conto.getSaldo());
        conto.deposita(10.0);
        System.out.println("Deposito: 100.0");
        conto.preleva(20.0);
        System.out.println("Prelievo: 500.0");

        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
