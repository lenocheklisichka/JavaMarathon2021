package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int index = a + 1;
        while (index < b) {
            if (index % 5 == 0 && index % 10 != 0) {
                System.out.print(index + " ");
            }
            index++;
        }
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
    }
}
