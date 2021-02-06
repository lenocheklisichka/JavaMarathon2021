package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            pw1.println(rand.nextInt(100));
        }
        pw1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);

        int sum = 0;
        int x = 0;
        while (scanner.hasNext()) {
            sum += Integer.parseInt(scanner.next());
            x++;
            if (x % 20 == 0) {
                pw2.println(sum / 20.0);
                x = 0;
                sum = 0;
            }
        }

        pw2.close();

        printResult(file2);
    }

    public static void printResult(File file2) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file2);
        double result = 0;
        while (scanner2.hasNext()) {
            result += Double.parseDouble(scanner2.next());
        }
        System.out.println("Сумма вещественных чисел равна: " + (int)result);
    }
}
