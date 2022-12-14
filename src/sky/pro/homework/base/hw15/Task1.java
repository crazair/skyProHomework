package sky.pro.homework.base.hw15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Task1 {

    public static void main(String[] args) {

// ## 1 задача
// Объявите три массива:
// 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
// - Подсказка
// ```java
// //объявление массива из 12-ти элементов, заполненного нулями
// int [] weight = new int [12];
// ```
// 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
// - Подсказка
// ```java
// //объявление целочисленного массива, заполненного 12 элементами
// int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
// ```
// 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
// с помощью ключевого слова или сразу заполненный элементами.

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        float[] floats = {1.57f, 7.654f, 9.986f};
        for (float f : floats) {
            System.out.println(f);
        }

        long[] longs = {1L, 2L, 3L};
        Arrays.stream(longs).forEach(System.out::println);

        printArray(IntStream.of(ints).boxed().toArray(Integer[]::new));
        printArray(LongStream.of(longs).boxed().toArray(Long[]::new));
    }

    /**
     * Параметры типа могут представлять только ссылочные типы, а не примитивные типы (например, int, double и char).
     * Ограничение Дженериков.
     */
    private static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
