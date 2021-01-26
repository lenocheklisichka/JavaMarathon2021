package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        Random rand = new Random();
        int[] array = new int[n];
        for (int index = 0; index < array.length; index++) {
            array[index] = rand.nextInt(10);
        }

        int count = 0;
        int countOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int countSumNumbers = 0;

        for (int element : array) {
            if (element > 8) {
                count++;
            }
            if (element == 1) {
                countOne++;
            }
            if (element % 2 == 0) {
                countEven++;
            }
            else if (element % 2 != 0) {
                countOdd++;
            }
            countSumNumbers += element;
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(array)
                + "\nДлина массива: " + array.length
                + "\nКоличество чисел после 8: " + count
                + "\nКоличество чисел равных 1: " + countOne
                + "\nКоличество четных чисел : " + countEven
                + "\nКоличество нечетных чисел: " + countOdd
                + "\nСумма всех элементов массива: " + countSumNumbers
        );
    }
}
