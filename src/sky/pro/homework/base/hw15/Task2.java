package sky.pro.homework.base.hw15;

public class Task2 {
    public static void main(String[] args) {

// ## 2 задача
// Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
// через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        float[] floats = {1.57f, 7.654f, 9.986f};
        long[] longs = {1L, 2L, 3L};

        System.out.println("ints: ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i < ints.length - 1) System.out.print(", ");
        }

        System.out.println("\n\nfloats: ");
        for (int i = 0; i < floats.length; i++) {
            System.out.print(floats[i]);
            if (i < floats.length - 1) System.out.print(", ");
        }

        System.out.println("\n\nlongs: ");
        for (int i = 0; i < longs.length; i++) {
            System.out.print(longs[i]);
            if (i < longs.length - 1) System.out.print(", ");
        }
    }


}
