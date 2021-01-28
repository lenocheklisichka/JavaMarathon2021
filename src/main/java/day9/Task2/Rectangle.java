package day9.Task2;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String figureColor) {
        super(figureColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double s;
        s = height * width;
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = ( height + width ) * 2;
        return p;
    }
}
