package day5;

public class Task1 {
    public static void main(String[] args) {
        Car skoda = new Car();
        skoda.setYearOfIssue(2020);
        skoda.setColor("White ");
        skoda.setModel("Octavia ");
        System.out.println("Skoda"
                + "\nГод выпуска: " + skoda.getYearOfIssue()
                + "\nЦвет: " + skoda.getColor()
                + "\nМодель: " + skoda.getModel());
    }
}

