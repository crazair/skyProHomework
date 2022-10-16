package sky.pro.homework.javacore.hw21;

import java.time.LocalDateTime;

public class Human {

    private final int years;
    private final String name;
    private final String city;
    private final String post;

    public Human(int years, String name, String city, String post) {
        this.years = years <= 0 ? 0 : years;
        this.name = name == null ? "Информация не указана" : name;
        this.city = city == null ? "Информация не указана" : city;
        this.post = post == null ? "Информация не указана" : post;
    }

    public void hello() {
        System.out.printf("\n Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Я работаю на должности %s. Будем знакомы!",
                name,
                city,
                LocalDateTime.now().getYear() - years,
                post);
    }

}
