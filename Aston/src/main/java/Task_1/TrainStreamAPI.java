package Task_1;

import java.util.ArrayList;
import java.util.Random;

public class TrainStreamAPI {
    public static void DemoStream() {
        ArrayList<Integer> AL = new ArrayList<>();
        int number;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            number = rnd.nextInt() % 100;
            AL.add(number);
        }

        System.out.println("Array AL:");
        System.out.println(AL);
        int n2 = (int) (AL.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("n2 = " + n2);
    }

    public static void main(String[] args) {
        DemoStream();
    }
}
/*1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел. */