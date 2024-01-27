package shcool.aston;

public class Circle implements Figure {
    private static final String NAME = "Circle";

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getNamme() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return "white";
    }

    @Override
    public String getBorderColor() {
        return "black";
    }


}
