package Task_5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Password {


    public static void TrainStream() {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> ALL = new ArrayList<>();
        System.out.println("Введите имя: ");
        while (true) {
            System.out.print("имя = ");
            s = scanner.nextLine();
            if (Objects.equals(s, ""))
                break;
            ALL.add(s);
        }
        System.out.println();
        System.out.println("ALL = " + ALL);
        Predicate<String> fn;
        fn = (str) -> str.charAt(0) == 'f';
        Stream<String> stream = ALL.stream();
        Stream<String> resStream = stream.filter(fn);
        System.out.println("count = " + resStream.count());
    }
    public static void main(String[] args) {
        TrainStream();
    }
}
/*5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
 Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя
  и вывести в консоль логины, начинающиеся на букву f (строчную).*/