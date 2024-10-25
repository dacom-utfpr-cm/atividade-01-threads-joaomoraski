package threads.ativ2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThreadsEx02 implements Runnable {

    String filename;

    public ThreadsEx02(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] phrases = line.split(" ");
                for (String phrase : phrases) {
                    System.out.printf(phrase + " ");
                    Thread.sleep(1 * 1000L);
                }
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("My execution was interrupted " + Thread.currentThread().getName());
        }
    }
}
