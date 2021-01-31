package day9.Task2;

public class Circle extends Figure {
    private final int radiusTheCircle;

    public Circle(int radiusTheCircle, String figureColor) {
        super(figureColor);
        this.radiusTheCircle = radiusTheCircle;
    }

    @Override
    public double area() {
        double s;
        s = Math.PI * (radiusTheCircle * radiusTheCircle);
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = radiusTheCircle*(Math.PI * Math.PI);
        return p;
    }
}
