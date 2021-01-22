package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int index = a + 1; index < b; index++) {
            if (index % 5 == 0 && index % 10 != 0) {
                System.out.print(index + " ");
            }
        }
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
    }
}
