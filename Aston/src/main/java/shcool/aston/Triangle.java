package shcool.aston;

public class Triangle implements Figure {
    private static final String NAME = "Triangle";

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getNamme() {
        return NAME;
    }

    @Override
    public String getFillColor() {
        return "green";
    }

    @Override
    public String getBorderColor() {
        return "black";
    }

}
