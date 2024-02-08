package Task_2;

import java.util.Arrays;
import java.util.List;

public class Highload {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Highload", "High", "Load", "Highload");
        String firstElement = strings.get(0);
        String lastElement = strings.get(0);
        long countHigh = strings.stream()
                .filter("High"::equals)
                .count();

        System.out.println("Количество вхождений объекта \"High\": " + countHigh);
        System.out.println("Первый элемент коллекции: " + firstElement);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}

/*2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить
 следующие манипуляции:
2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию,
 то пусть возвращается 0;
2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;*/