import threads.ativ1.Atividade01;
import threads.ativ2.Atividade02;
import threads.ativ3.Atividade03;
import threads.ativ4.Atividade04;
import threads.ativ5.Atividade05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------ Atividade 01 ------------");
        List<Thread> threads = new ArrayList<>(new Atividade01(100).run());
        System.out.println("------------ Atividade 02 ------------");
        threads.add(new Atividade02("src/threads/ativ2/frases.txt").run());
        System.out.println("------------ Atividade 03 ------------");
        threads.add(new Atividade03(threads).run());
        System.out.println("------------ Atividade 04 Monitor ------------");
        new Atividade04(threads).run();
        System.out.println("------------ Atividade 04 Monitor ------------");
        new Atividade05().run();


    }
}