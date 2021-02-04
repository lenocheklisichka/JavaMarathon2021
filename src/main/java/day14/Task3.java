package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenka\\Desktop\\projectJava\\JavaMarathon2021\\src\\main\\resources\\people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл " + e);
        }
        return null;
    }
}
