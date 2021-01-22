package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = s.nextInt();
        if (index >= 1 && index <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (index >= 5 && index <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (index >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
