package shcool.aston.figure;

import shcool.aston.figure.Figure;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(String name, String fillColor, String borderColor,double width, double height) {
        super(name,fillColor,borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }




}
