package sky.pro.homework.base.hw15;

public class Task4 {

    public static void main(String[] args) {

// ### 4 задача
// Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
// Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
//  Распечатайте результат преобразования в консоль.

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) ints[i] += 1;
            System.out.println(ints[i]);
        }

//        Arrays.stream(ints).forEach(value -> {
//            if (value % 2 != 0) value +=1;
//            System.out.println(value);
//        });

    }
}
