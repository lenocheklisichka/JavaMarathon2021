package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Porsche");
        carBrands.add("Nissan");
        carBrands.add("Volkswagen");
        carBrands.add("Mercedes-Benz");
        carBrands.add("BMW");
        System.out.println(carBrands);

        carBrands.add(3, "Hyundai ");
        carBrands.remove("Porsche");
        System.out.println(carBrands);
    }
}
