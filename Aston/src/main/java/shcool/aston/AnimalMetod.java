package shcool.aston;

public class AnimalMetod {


    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Лапа", 3, 33, 3, false);
        animals[1] = new Cat("Sky", 0, 150, 44, false);
        animals[5] = new Dog("Бобик", 5,166);
        animals[6] = new Dog("Лора", 37,350);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: " + Animal.getCount());

        animals[0].test();
        animals[1].test();
        animals[5].test();
        animals[6].test();



    }
}









