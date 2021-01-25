package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike kawasaki = new Motorbike(2019, "black", "Performance Sport");
        System.out.println("KAWASAKI"
                + "\nГод выпуска: " + kawasaki.getYearOfIssue()
                + "\nЦвет: " + kawasaki.getColor()
                + "\nМодель: " + kawasaki.getModel());
    }
}

class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
