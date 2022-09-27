package sky.pro.homework.base.hw17;

public class Task1 {

    public static void main(String[] args) {

// ### **Задание 1**
// Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате, и
// бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.
// Напишите четыре строки:
// первая с именем firstName — для хранения имени;
// вторая с именем middleName — для хранения отчества;
// третья с именем lastName — для хранения фамилии;
// четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
// Выведите в консоль фразу: “ФИО сотрудника — ….”
// В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        StringBuilder fullName = new StringBuilder()
                .append(lastName)
                .append(" ")
                .append(firstName)
                .append(" ")
                .append(middleName);

        System.out.printf("ФИО сотрудника — %s", fullName);

    }
}
