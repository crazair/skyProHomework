package sky.pro.homework.base.hw1;

public class Task2 {

    public static void main(String[] args) {

// Задача 2
// А теперь решите задание.
// В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
// что боксеры соответствуют своей весовой категории, и бой будет честным.
// Вес одного боксера – 78,2 кг
// Вес второго боксера – 82,7 кг
// Подсчитайте и выведите в консоль общий вес двух бойцов.
// Подсчитайте и выведите в консоль разницу между весами бойцов.

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов: " + totalWeight);

        float differenceWeight = Math.abs(firstBoxerWeight - secondBoxerWeight); //по модулю
        System.out.println("Разница между весами бойцов: " + differenceWeight);

    }

}
