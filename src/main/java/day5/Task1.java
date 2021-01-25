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

class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
