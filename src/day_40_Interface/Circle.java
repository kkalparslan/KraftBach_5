package day_40_Interface;

public class Circle extends Square implements Geometric{
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getArea(double expo) {
        return Geometric.PI *Math.pow(a, expo);
    }
}
