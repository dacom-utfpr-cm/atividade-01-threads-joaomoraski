package threads.ativ1;

public class ThreadsEx01 implements Runnable {

    long seconds;

    public ThreadsEx01(long seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            System.out.println("Iniciando a thread" + Thread.currentThread().getName());
            Thread.sleep(seconds);
            System.out.println("Finalizado a thread" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("My execution was interrupted " + Thread.currentThread().getName());
        }
    }
}
