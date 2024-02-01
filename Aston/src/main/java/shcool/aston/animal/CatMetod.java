package shcool.aston.animal;



import java.util.Scanner;

public class CatMetod {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        int action;

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Лапа", 3, 33, 23, false);
        allCats[1] = new Cat("Снежок", 0, 120, 2, false);
        allCats[2] = new Cat("Мурзик", 0, 55, 12, false);
        allCats[3] = new Cat("Осень", 12, 64, 47, false);


        Plate plate = new Plate(26);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Кот " + allCat.name + " поел!");
            } else {
                System.out.println("Кот " + allCat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить  в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }


    }





