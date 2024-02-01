package shcool.aston.figure;

import shcool.aston.figure.Figure;

public class Triangle extends Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(String name, String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(name,fillColor,borderColor);
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



}
