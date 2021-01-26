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

