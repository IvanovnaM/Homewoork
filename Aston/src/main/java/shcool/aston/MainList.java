package shcool.aston;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainList {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = getStringIntegerMap();
        List<String> uniqueWords = new ArrayList<>(wordCounts.keySet());
        System.out.println("args = " + uniqueWords);
        System.out.println("args = " + wordCounts);
        System.out.println();

        PhoneBook phonebook = new PhoneBook();
        phonebook.addNumber("654-45-00", "Добрыня");
        phonebook.addNumber("985-73-92", "Сазанкова");
        phonebook.addNumber("987-45-00", "Попов");
        phonebook.addNumber("544-76-43", "Сазанкова");
        phonebook.addNumber("543-50-21", "Клим");
        phonebook.getNumber("Добрыня");
        phonebook.getNumber("Сазанкова");
        phonebook.getNumber("Попов");
        phonebook.getNumber("Клим");
    }

    private static Map<String, Integer> getStringIntegerMap() {
        String[] wordsArray = {"дорога", "небо", "друзья", "мотоцикл", "счастье",
                "лето", "капитан", "дождь", "лето", "небо", "ценность",
                "море", "возможность", "команда", "дорога", "команда", "рок",
                "стиль", "металл", "лето"};
        //
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : wordsArray) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}