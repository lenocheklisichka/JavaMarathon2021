package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = a / b;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            if (b != 0) {
                System.out.println(c);
            }
        }
    }
}
