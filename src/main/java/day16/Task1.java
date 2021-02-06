package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\fileNumber.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            double sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            double x = sum / (double)numbers.length;
            DecimalFormat df = new DecimalFormat("#.###");
            String l = df.format(x);
            System.out.println( x + " --> " + l);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        }
    }
}

