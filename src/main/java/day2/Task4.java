package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double x = number.nextDouble();
        double y;
        if (x >= 5) {
            y = (((x * x) - 10) / (x + 7));
        } else if ((-3 < x) && (x < 5)) {
            y = ((x + 3) * ((x * x) - 2));
        } else {
            y = 420.0;
        }
        System.out.println(y);
    }
}
