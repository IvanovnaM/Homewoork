package shcool.aston;

public class Rectangle implements Figure {
    private static final String NAME = "Rectangle";

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getNamme() {
        return NAME;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String getFillColor() {
        return "red";
    }

    @Override
    public String getBorderColor() {
        return "black";
    }


}
