package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")};

        System.out.println("Сумма периметров красных фигур: " + calculateRedPerimeter(figures)
                + "\nСумма площадей красных фигур: " + calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        int sumOfPerimeters = 0;
        for (int index = 0; index < figures.length; index++) {
            if (figures[index].getColor().equals("Red")) {
                sumOfPerimeters += figures[index].perimeter();
            }
        }
        return sumOfPerimeters;
    }

    public static double calculateRedArea(Figure[] figures) {
        int sumOfAreas = 0;
        for (int index =0; index < figures.length; index++) {
            if (figures[index].getColor().equals("Red")) {
                sumOfAreas += figures[index].area();
            }
        }
        return sumOfAreas;
    }
}
