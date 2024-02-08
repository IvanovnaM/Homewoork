package Task_3;

import java.util.Arrays;
import java.util.Collection;


public class MainSorted {

    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        String[] array = sortCollectionToArray(collection);
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
        System.out.println("\n");

    }

    public static String[] sortCollectionToArray(Collection<String> collection) {
        return collection.stream().sorted(new SpecialComparator()).toArray(String[]::new);
    }
}



/*3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
Необходимо отсортировать строки по возрастанию и добавить их в массив;*/



        



  





                /*3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4". Необходимо
                 отсортировать строки по возрастанию и добавить их в массив;*/