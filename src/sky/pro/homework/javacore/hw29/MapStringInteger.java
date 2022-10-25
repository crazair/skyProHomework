package sky.pro.homework.javacore.hw29;

import java.util.HashMap;
import java.util.Map;

public class MapStringInteger {

    private static Map<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        fillMap(20);

        map.put("str1", 1);
        addToMap("str2", 2);

        map.forEach((s, i) -> System.out.println(s + " --> " + i));
    }

    public static void fillMap(int count) {
        while (map.size() <= count) {
            map.put(RandomUtils.getRandomString(10), RandomUtils.getRandomInteger());
        }
    }

    public static void addToMap(String s, Integer i) {
        if (!map.containsKey(s)) {
            map.put(s, i);
        } else {
            if (map.get(s).equals(i)) {
                throw new RuntimeException("Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение!");
            } else {
                map.replace(s, i);
            }
        }
    }
}
