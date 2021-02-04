package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        try {
            File file = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
            Scanner scanner = new Scanner(file);

            File file2 = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
            PrintWriter pw = new PrintWriter(file2);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    pw.println(array[0] + "," +  array[1] + "," + array[2]);
                }
            }
            pw.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден " + e);
        }
    }
}
