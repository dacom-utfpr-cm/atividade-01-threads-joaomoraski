package threads.ativ2;

import threads.ativ1.ThreadsEx01;

import java.util.Random;

public class Atividade02 {

    private String filename;

    public Atividade02(String filename) {
        this.filename = filename;
    }

    public Thread run() {
        Thread thread = new Thread(new ThreadsEx02(filename), "Atividade 02");
        thread.start();
        return thread;
    }

}
