package sky.pro.homework.hw15;

public class Task5 {

    public static void main(String[] args) {

// Задание 8  Очень сложно.
// Задача, которая используется/бывает/встречается на собеседованиях.
// Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
// Необходимо найти два числа, сумма которых равна −2.
// Напечатать эти числа в консоль.
// Подсказка
// Может потребоваться отсортировать массив с помощью Arrays.sort(arr).

// Задание 9  Очень сложно.
// Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.

        int[] ints = {-6, 2, 5, -8, 8, 10, 4, -7, 12, -1};

        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == -2) {
                    System.out.println("Cумма чисел = -2. Первое число: " + ints[i] + " Второе число: " + ints[j]);
                }
            }
        }


    }
}
