package sky.pro.homework.base.hw17;

public class Task3 {

    public static void main(String[] args) {

// ### **Задание 3**
// Система, в которой мы работаем, не принимает символ “ё”.
// Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
// В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
// Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”

        String fullName = "Иванов Семён Семёнович";
        System.out.printf("Данные ФИО сотрудника — %s", fullName.replace("ё", "е"));

    }
}
