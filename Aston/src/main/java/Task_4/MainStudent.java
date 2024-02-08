package Task_4;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        double averageAgeMaleStudents = getAverageAgeMaleStudents(students);
        System.out.println("Средний возраст мужчин= " + averageAgeMaleStudents);


        Collection<String> conscriptStudents = getConscriptStudents(students);
        System.out.println("Повестка грозит! " + conscriptStudents);
    }

    private static double getAverageAgeMaleStudents(Collection<Student> students) {
        long countMaleStudents = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .count();
        if (countMaleStudents == 0) {
            return 0;
        }

        double sumAgeMaleStudents = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .sum();
        return sumAgeMaleStudents / countMaleStudents;
    }

    private static Collection<String> getConscriptStudents(Collection<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27 && student.getGender()
                        == Gender.MAN)
                .map(Student::getName).collect(Collectors.toList());
    }

}

/*4. Создай класс со следующим содержимым: (СМ. СКРИНШОТ).
4.1. Необходимо узнать средний возраст студентов мужского пола.
4.2. Кому из студентов грозит получение повестки в этом году при условии,
что призывной возраст установлен в диапазоне от 18 до 27 лет.*/