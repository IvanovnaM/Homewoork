import java.util.ArrayList;

public class MainFruit {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        for (int i = 0; i < 15; i++) {
            appleBox.addFruitsToBox(new Apple());
        }
        System.out.println("Вес Apple в  коробке= " + appleBox.getWeight());               // Получаем вес коробки с яблоками

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            orangeBox.addFruitsToBox(new Orange());
        }
        System.out.println("Вес Orange в  коробке= " + orangeBox.getWeight());              // Получаем вес коробки с апельсинами

        System.out.println(appleBox.compare(orangeBox));        // Сравниваем две коробки с фруктами

        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        appleBox.putFruitInAnotherBox(appleBox2);               // Перекидываем фрукты из одной коробки в другую
        System.out.println(appleBox2);
    }
}
