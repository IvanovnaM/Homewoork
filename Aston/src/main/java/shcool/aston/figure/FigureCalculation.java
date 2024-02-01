package shcool.aston.figure;

public interface FigureCalculation {

    default double getArea() {
        return 0;
    }

    default double getPerimeter() {
        return 0;
    }
}
