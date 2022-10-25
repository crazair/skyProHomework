package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Set;

public class IntegerSet {

    private static Set<Integer> integerSet = new HashSet<>();

    public static void main(String[] args) {
        for (int j = 0; j < 20; j++) {
            integerSet.add((int) (Math.random() * 1000));
        }

        integerSet.removeIf(integer -> integer % 2 != 0);
        integerSet.forEach(System.out::println);
    }

}
