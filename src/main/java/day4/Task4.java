package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(10000);
            System.out.print(array[index] + " ");
        }
        System.out.println();

        int sumThreeElements = 0;
        int indexFirstElement  = 0;
        int sum = 0;
        for (int index = 0; index < array.length -2; index++) {
            for (int y = index; y < index + 3; y++) {
                sum += array[y];
            }
            if (sum > sumThreeElements) {
                sumThreeElements = sum;
                sum = array[index];
            }
        }
        System.out.println(sumThreeElements + "\n" + indexFirstElement);




    }
}
