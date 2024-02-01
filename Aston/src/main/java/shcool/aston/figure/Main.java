package shcool.aston.figure;

public class Main {
    public static void main(String[] args) {

        Figure[] figure = {new Circle("Circle", "белый", "красный",5),
                new Rectangle("Rectangle","зелёный", "коричневый", 4, 12),
                new Triangle("Triangle", "синий", "голубой", 6, 9, 6)};

        for (Figure figures : figure) {
            System.out.println(figures);
        }



    }
}
