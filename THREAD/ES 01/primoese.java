class MioThread extends Thread {
    private String threadNome;

    public MioThread(String nome) {
        this.threadNome = nome;
        this.setName(nome);
    }

    public void run() {
        System.out.println("Esecuzione del thread con ereditarietà: " + threadNome);
    }
}

class MioRunnable implements Runnable {
    private String threadNome;

    public MioRunnable(String nome) {
        this.threadNome = nome;
    }

    public void run() {
        System.out.println("Esecuzione del thread con Runnable: " + threadNome);
    }
}

public class primoese {
    public static void main(String[] args) {
        
        new MioThread("Thread Ereditato").start();
        new Thread(new MioRunnable("Thread Runnable")).start();

         Thread lambdaThread = new Thread(() -> {
            System.out.println("Esecuzione del thread tramite lambda");
        });
    }
}