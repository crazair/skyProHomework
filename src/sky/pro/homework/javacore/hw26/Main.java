package sky.pro.homework.javacore.hw26;

import sky.pro.homework.javacore.hw26.exceptions.WrongLoginException;
import sky.pro.homework.javacore.hw26.exceptions.WrongPasswordException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            new Auth("FFFFFF_", "pass", "FFFFFF").isDataCorrect();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Произошла ошибка: " + e);
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        }
    }
}
