package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    public static int recursionSum(int[] numbers) {
        int sum = 0;
        int length = numbers.length;
        int[] copyNumbers;
        if (length > 0) {
            copyNumbers = Arrays.copyOf(numbers, length -1);
            sum += recursionSum(copyNumbers) + numbers[length - 1];
        }
        return sum;
    }
}
