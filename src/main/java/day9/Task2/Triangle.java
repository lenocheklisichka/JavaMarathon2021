package day9.Task2;

public class Triangle extends Figure {
    private final int lengthA;
    private final int lengthB;
    private final int lengthC;

    public Triangle(int lengthA, int lengthB, int lengthC, String figureColor) {
        super(figureColor);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
       double p, s;
       p = (lengthA + lengthB + lengthC) / 2;
       s = Math.sqrt(p * ( p - lengthA) * (p - lengthB) * (p - lengthC));
       return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = lengthA + lengthB + lengthC;
        return p;
    }
}
