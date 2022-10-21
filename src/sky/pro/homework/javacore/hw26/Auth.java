package sky.pro.homework.javacore.hw26;

import sky.pro.homework.javacore.hw26.exceptions.WrongLoginException;
import sky.pro.homework.javacore.hw26.exceptions.WrongPasswordException;

public class Auth {

    public static final String PATTERN = "^[a-zA-Z0-9_]+$";

    private String login;
    private String password;
    private String confirmPassword;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean isDataCorrect() throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() < 1 || login.length() > 20 || !login.matches(PATTERN)) {
            throw new WrongLoginException("Логин должен быть не пустой, больше 1-го символа, меньше 20, содержать в себе только латинские буквы, цифры и знак подчеркивания");
        }
        if (password == null || password.length() < 1 || password.length() > 20 || !password.matches(PATTERN)) {
            throw new WrongPasswordException("Пароль должен быть не пустой, больше 1-го символа, меньше 20, содержать в себе только латинские буквы, цифры и знак подчеркивания");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль должен быть равен повтору");
        }
        return true;
    }


//        Вводные по данным:
    //        - Логин содержит в себе только латинские буквы, цифры и знак подчеркивания.
    //        - Длина логина может быть от 1 до 20 символов. Если логин не указан или длиннее заданой формы, содержит в
    //        себе другие знаки, то нужно выбросить `WrongLoginException`.
    //        - Password содержит в себе только латинские буквы, цифры и знак подчеркивания. Длина password быть от 1 до 20
    //        символов. Password и confirmPassword должны быть равны. Если password не указан или длиннее заданой формы,
    //        содержит в себе другие знаки, password и confirmPassword не равны, то нужно выбросить `WrongPasswordException`.
    //        - `WrongPasswordException` и `WrongLoginException` - пользовательские классы исключения с двумя конструкторами –
    //        один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса `Exception`.
    //        - Подсказка
//
// Общую логику проверки можно вынести в отдельный метод.
// Если все вводимые значения корректны и верны, то метод должен возвращать`true`. Если данные некорректны или не выполняют всех условий, то метод выбрасывает исключение.
// В методе main необходимо вызывать созданный метод и обрабатывать ошибки.

}
