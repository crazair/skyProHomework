package sky.pro.homework.javacore.hw29;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private Map<String, String> phonebookMap = new HashMap<>();

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.getPhonebookMap().put("Иванов И.И.", "+7920544455114");
        phonebook.getPhonebookMap().put("Иванов И.А.", "+7920566655114");
        phonebook.getPhonebookMap().put("Сидоров И.А.", "+7920566345114");
        phonebook.getPhonebookMap().put("Котов И.А.", "+79205345667114");
        phonebook.getPhonebookMap().put("Петров И.А.", "+7920566655114");
        phonebook.getPhonebookMap().put("Иванченко И.А.", "+7926766655114");
        phonebook.getPhonebookMap().put("Турки И.А.", "+7920566655114");
        phonebook.getPhonebookMap().put("Заикин И.А.", "+79435655114");
        phonebook.getPhonebookMap().put("Ларин И.А.", "+7920566655114");
        phonebook.getPhonebookMap().put("Гуторов И.А.", "+792056624655114");

        phonebook.getPhonebookMap().forEach((s, s2) -> System.out.println(s + " --> " + s2));
    }

    public Map<String, String> getPhonebookMap() {
        return phonebookMap;
    }

    public void setPhonebookMap(Map<String, String> phonebookMap) {
        this.phonebookMap = phonebookMap;
    }
}
