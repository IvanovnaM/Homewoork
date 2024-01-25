package shcool.aston;
/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль. */

public class Employee {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + number + "\n-"
                + salary + "\n-"
                + age);
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО : " + name);
        System.out.println("Должность : " + position);
        System.out.println("Email : " + email);
        System.out.println("Номер телефона : " + number);
        System.out.println("Зарплата : " + salary);
        System.out.println("Возраст : " + age);
        System.out.println();
    }


}
