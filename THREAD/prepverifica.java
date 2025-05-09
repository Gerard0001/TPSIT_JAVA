/*1. Creare la classe di nome "Saluto" che estenda la classe Thread
- Sovrascrivere il metodo  run() per fare stampare "Thread che saluta. Creato come estensione della classe Thread"
- Aggiungere un costruttore che accetti il nome del thread
2. Creare una classe di tipo Runnable di nome mioSaluto come implementazione dell'interfaccia Runnable
- implementare run() per stampare "Thread eseguito tramite runnable"
3. Nel metodo Main : creare un'istanza di Saluto e un'istanza di mioSaluto
- creare un thread utilizzando la lamda expression che stampi "Sto usando una lamda expression" */

class Saluto extends Thread {
    public Saluto (String nome) {

        super(nome);

    }
    @Override
    public void run() {

        System.out.println("thread saluta!");

    }
}

class Miosaluto implements Runnable {

    @Override
    public void run() {

        System.out.println("thread con runnable");
    }
}

public class prepverifica {

    public static void main(String[] args) {

        Saluto t1 = new Saluto ("threadSaluto");
        t1.start();

        Miosaluto salutoRunnable = new Miosaluto();
        Thread t2 = new Thread(salutoRunnable);
        t2.start();

        Thread t3 = new Thread(() -> {

            System.out.println("thread con lambda expression");

        });

        t3.start();

    }

}

