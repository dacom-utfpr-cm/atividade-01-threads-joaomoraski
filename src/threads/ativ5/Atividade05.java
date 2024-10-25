package threads.ativ5;

public class Atividade05 {

    public void run() {
        ThreadsEx05 threadsEx05 = new ThreadsEx05();
        Thread thread = new Thread(threadsEx05);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Soma final: %d", threadsEx05.getSum());
    }

}
