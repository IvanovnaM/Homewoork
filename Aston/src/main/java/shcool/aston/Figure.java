package shcool.aston;

public interface Figure {
    default double getArea() {
        return 0;
    }

    default double getPerimeter() {
        return 0;
    }

    String getNamme();

    String getFillColor();

    String getBorderColor();
}

