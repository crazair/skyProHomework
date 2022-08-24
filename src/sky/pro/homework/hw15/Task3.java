package sky.pro.homework.hw15;

public class Task3 {

    public static void main(String[] args) {

// ## 3 задача
// Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
// а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на
// одной строчке, а элементы другого массива – на другой.
// Запятая между последним элементом одного массива и первым элементом следующего не нужна.
// Если во втором задании в консоль у вас вывелся результат
// 1, 2, 3
// 1.57, 7.654, 9.986
// *произвольные элементы третьего массива*
// То в третьем задании результат должен быть
// 3, 2, 1
// 9.986, 7.654, 1.57
// *произвольные элементы третьего массива в обратном порядке*

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        float[] floats = {1.57f, 7.654f, 9.986f};
        long[] longs = {1L, 2L, 3L};

        System.out.println("ints: ");
        for (int i = ints.length; i > 0; i--) {
            System.out.print(ints[i - 1]);
            if (i > 1) System.out.print(", ");
        }

        System.out.println("\n\nfloats: ");
        for (int i = floats.length; i > 0; i--) {
            System.out.print(floats[i - 1]);
            if (i > 1) System.out.print(", ");
        }

        System.out.println("\n\nlongs: ");
        for (int i = longs.length; i > 0; i--) {
            System.out.print(longs[i - 1]);
            if (i > 1) System.out.print(", ");
        }


    }
}
