package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);
    }
}
