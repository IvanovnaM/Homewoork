package shcool.aston;
/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль. */

public class Employee {

    String name;
    String position;
    String email;
    String number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО : " + this.name);
        System.out.println("Должность : " + this.position);
        System.out.println("Email : " + this.email);
        System.out.println("Номер телефона : " + this.number);
        System.out.println("Зарплата : " + this.salary);
        System.out.println("Возраст : " + this.age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Chad Turner", "Engineer",
                "Chad Turner@gmail.com", "11111111111", 1000, 30);
        employeesArray[1] = new Employee("Alma Thomas", "Job title 2",
                "Alma Thomas@gmail.com", "2222222222", 1100, 20);
        employeesArray[2] = new Employee("Catherine Adkins", "Job title 3",
                "Catherine Adkins@gmail.com", "3333333333", 1200, 25);
        employeesArray[3] = new Employee("Nellie Brown", "Job title 4",
                "Nellie Brown@gmail.com", "44444444", 1300, 37);
        employeesArray[4] = new Employee("Mary Lopez", "Job title 5",
                "Mary Lopez@gmail.com", "555555555", 1400, 23);

    }

    }
