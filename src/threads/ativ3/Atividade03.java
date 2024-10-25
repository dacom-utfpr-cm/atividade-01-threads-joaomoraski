package threads.ativ3;

import threads.ativ1.ThreadsEx01;

import java.util.List;

public class Atividade03 {

    List<Thread> threads;

    public Atividade03(List<Thread> threads) {
        this.threads = threads;
    }

    public Thread run() {
        Thread threadReturn = new Thread(() -> {
            try {
                Thread.sleep(3000);
                for (Thread thread : threads) {
                    thread.interrupt();
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                System.out.println("My execution was interrupted");
            }
        }, "Atividade 03");
        threadReturn.start();
        return threadReturn;
    }

}
