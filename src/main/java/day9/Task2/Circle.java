package day9.Task2;

public class Circle extends Figure {
    private final int radiusTheCircle;
    final double Pi = 3.14;

    public Circle(int radiusTheCircle, String figureColor) {
        super(figureColor);
        this.radiusTheCircle = radiusTheCircle;
    }

    @Override
    public double area() {
        double s;
        s = Pi * (radiusTheCircle * radiusTheCircle);
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = radiusTheCircle*(Pi * Pi);
        return p;
    }
}
