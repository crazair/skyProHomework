package sky.pro.homework.hw14;

public class Task1 {

    public static void main(String[] args) {

// ### Задание 1
// Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
// На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
// Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
// Не забудьте выполнить переход на новую строку между двумя циклами.
// В результате программы вывод должен получиться следующий:
//  1 2 3 4 5 6 7 8 9 10
//  10 9 8 7 6 5 4 3 2 1

        int i = 1;
        while (i <= 10) System.out.print(i++ + " ");
        System.out.println("");
        for (int j = 10; j >= 1; j--) System.out.print(j + " ");
    }
}
