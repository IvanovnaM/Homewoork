package shcool.aston;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, String> phonebook;

    PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void addNumber(String phoneNumber, String lastName) {
        phonebook.put(phoneNumber, lastName);
    }

    public void getNumber(String lastName) {
        if (phonebook.containsValue(lastName)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if (temp.getValue().equals(lastName)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("В справочнике отсутствует фамилия");
        }
    }
}
