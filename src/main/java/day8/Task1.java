package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String result = "";
        for (int index = 0; index <= 20000; index++) {
            result += index + " ";
        }
        System.out.println(result);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("\nВремя работы программы: " + timeConsumedMillis);


        long st = System.currentTimeMillis();

        StringBuilder numberRow = new StringBuilder();

        for (int index = 0; index <= 20000; index++) {
            numberRow.append(index + " ");
        }
        System.out.print(numberRow.toString());

        long fin = System.currentTimeMillis();
        long timeConsumedMilli = fin - st;
        System.out.println("\nВремя работы программы: " + timeConsumedMilli);
    }

}

