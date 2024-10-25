package threads.ativ1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Atividade01 {

    private int limit;

    public Atividade01(int limit) {
        this.limit = limit;
    }

    public List<Thread> run() {
        Random rand = new Random();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            threads.add(new Thread(new ThreadsEx01(rand.nextInt(1, this.limit) * 1000L), "Thread-" + i));
            threads.get(i).start();
        }
        return threads;
    }

}
