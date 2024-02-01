package shcool.aston.figure;

public abstract class Figure implements FigureCalculation{
    public   String name;
    public String fillColor;
    public String borderColor;
    public Figure (String name, String fillColor, String borderColor) {
        this.name = name;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getName() {
        return name;
    }


        public String toString() {
            return getName() + " [" +
                    "Площадь: " + getArea() +
                    ", Периметр " + getPerimeter() +
                    ", Цвет фона " + fillColor() +
                    ", Цвет границы: " +borderColor() + "." +
                    ']';
        }

    private String fillColor() {
        return fillColor;
    }

    private String borderColor() {
        return borderColor;
    }
}






