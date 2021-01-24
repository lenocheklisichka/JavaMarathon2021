package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = rand.nextInt(10000);
        }

        int largestArrayElement = 0;
        int smallestElementArray = 10000;
        int amountArrayElements = 0;
        int sum = 0;

        for (int element : array) {
            if (element > largestArrayElement) {
                largestArrayElement = element;
            }
            if (element < smallestElementArray) {
                smallestElementArray = element;
            }
            if (element % 10 == 0) {
                amountArrayElements++;
            }
            if (element % 10 == 0) {
                sum += element;
            }
        }
        System.out.println("наибольший элемент массива: " + largestArrayElement
                + "\nнаименьший элемент массива: " +  smallestElementArray
                + "\nколичество элементов массива, оканчивающихся на 0: " + amountArrayElements
                + "\nсумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
