package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random rand = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = rand.nextInt(50);
            }
        }
        int maxSum = 0;
        int resultNumberRow = 0;
        int currentSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                currentSum += matrix[row][column];
            }
            if (currentSum >= maxSum) {
                maxSum = currentSum;
                resultNumberRow = row;
            }
        }
        System.out.println(resultNumberRow);
    }
}
