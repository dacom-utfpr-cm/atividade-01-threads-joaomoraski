package threads.ativ4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade04 {

    List<Thread> threads;

    public Atividade04(List<Thread> threads) {
        this.threads = threads;
    }

    public void run() {
        while (true) {
            for (Thread thread : threads) {
                if (thread.isInterrupted()) {
                    System.out.println("Monitor log: " + thread.getName() + " interrupted");
                }
            }

            if (threads.stream().noneMatch(Thread::isAlive)) {
                System.out.println("Monitor was interrupted");
                break;
            }
        }
    }

}
