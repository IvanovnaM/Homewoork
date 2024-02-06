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
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Добрыня", "654-45-00");
        phoneBook.add("Сазанкова", "985-73-92");
        phoneBook.add("Попов", "987-45-00");
        phoneBook.add("Сазанкова", "544-76-43");
        phoneBook.add("Клим", "543-50-21");

        System.out.println("Телефон Добрыня: " + phoneBook.get("Добрыня"));
        System.out.println("Телефон Попов: " + phoneBook.get("Попов"));
        System.out.println("Телефоны Сазанкова: " + phoneBook.get("Сазанкова"));
        System.out.println("Телефоны Клим: " + phoneBook.get("Клим"));

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