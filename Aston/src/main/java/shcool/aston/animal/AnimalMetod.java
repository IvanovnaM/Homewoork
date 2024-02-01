package shcool.aston.animal;


public class AnimalMetod {
    public static void main(String[] args) {
        Animal animal = new Cat("Лапа", 3, 33, 3, false);
        animal.toSwim();
        animal.toRun();
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Лапа", 3, 33, 3, false);
        animals[1] = new Cat("Sky", 0, 150, 44, false);
        animals[2] = new Dog("Бобик", 5, 166);
        animals[3] = new Dog("Лора", 37, 350);


        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: " + Animal.getCount());


    }
}









