package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\file.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            System.out.println("Сумма чисел равна: " + sum);

            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        }
    }
}
