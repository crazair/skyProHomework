package sky.pro.homework.javacore.hw29;

import java.util.HashMap;
import java.util.Map;

public class MapIntegerString {

    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        while (map.size() <= 10) {
            map.put(RandomUtils.getRandomInteger(), RandomUtils.getRandomString(10));
        }
        map.forEach((i, s) -> System.out.println(i + ":" + s));
    }
}

