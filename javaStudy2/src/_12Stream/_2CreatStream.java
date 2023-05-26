package _12Stream;

import java.util.*;
import java.util.stream.Stream;

public class _2CreatStream {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list= new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接生成流
        Map<String,Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        Map<String,Integer> m = new HashMap<>();
        m.put("xiaolu",1);
        m.put("zhuHaoWen",2);
        m.put("MaYing",3);
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        System.out.println(entries);

        //数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray= {"hello","world","java"};
        Stream<String> strArray1 = Stream.of(strArray);

        Stream<String> stringStream = Stream.of("hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);

    }
}
