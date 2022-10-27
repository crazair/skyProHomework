package sky.pro.homework.javacore.hw29;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStringListInteger {

private static Map<String, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("str1", RandomUtils.getRandomArrayListInteger(3));
        map.put("str2", RandomUtils.getRandomArrayListInteger(3));
        map.put("str3", RandomUtils.getRandomArrayListInteger(3));
        map.put("str4", RandomUtils.getRandomArrayListInteger(3));
        map.put("str5", RandomUtils.getRandomArrayListInteger(3));

        map.forEach((s, i) -> System.out.println(s + " --> " + i));

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()){
            stringIntegerMap.put(entry.getKey(), entry.getValue().stream().mapToInt(value -> value).sum());
        }

        stringIntegerMap.forEach((s, i) -> System.out.println(s + " -->" + i));
    }

}
