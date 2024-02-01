package shcool.aston.figure;

public class Circle extends Figure {
    private final double radius;
    public Circle(String name, String fillColor, String borderColor,double radius) {
        super(name,fillColor,borderColor);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }




}
