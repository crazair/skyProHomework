package sky.pro.homework.base.hw17;

public class Task2 {

    public static void main(String[] args) {

// ### **Задание 2**
// Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф. И. О. сотрудников, полностью
// написанные заглавными буквами (верхним регистром).
// Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
// В качестве строки с исходными данными используйте строку fullName.
// Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”

        String fullName = "Ivanov Ivan Ivanovich";
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", fullName.toUpperCase());

    }
}