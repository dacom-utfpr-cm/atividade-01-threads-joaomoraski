package threads.ativ5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreadsEx05 implements Runnable {

    private int sum = 0;

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência de números, separados por espaços:");
        String input = scanner.nextLine();
        List<String> numbers = Arrays.stream(input.split(" ")).toList();

        numbers.forEach(s -> sum += Integer.parseInt(s));
        scanner.close();
    }
}
