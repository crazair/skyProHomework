package sky.pro.homework.javacore.hw29;

import java.util.ArrayList;
import java.util.Random;

public class RandomUtils {

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static Integer getRandomInteger() {
        return (int) (1000 + (Math.random() * 1000));
    }

    public static ArrayList<Integer> getRandomArrayListInteger(int length) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            integers.add((int) (Math.random() * 1000));
        }
        return integers;
    }
}
