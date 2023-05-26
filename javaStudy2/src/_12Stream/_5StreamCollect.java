package _12Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _5StreamCollect {
    public static void main(String[] args) {
        ArrayList<String> manArr = new ArrayList<>();
        manArr.add("朱浩闻");
        manArr.add("朱红伟");
        manArr.add("贝爷");
        manArr.add("猴子");
        manArr.add("容嘉贝");
        manArr.add("周子扬");


//        Stream<String> listStream = manArr.stream().limit(3);
//        List<String> names = listStream.collect(Collectors.toList());
        List<String> names = manArr.stream().limit(3).collect(Collectors.toList());

        System.out.println(names);

        System.out.println("----set-----");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        //得到年龄大于25的流
        Set<Integer> collect = set.stream().filter(i -> i > 25).collect(Collectors.toSet());
        System.out.println(collect);

        System.out.println("-------");

        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25",};
        Stream<String> stream = Stream.of(strArray);
        Stream<String> newStream = stream.filter((String s) -> {
            String name = s.split(",")[0];
            Integer age = Integer.parseInt(s.split(",")[1]);
            return age > 28;
        });

//        newStream.collect(Collectors.toMap(s->{return s.split(",")[0];},s->{return Integer.parseInt(s.split(",")[1])}));
        Map<String, Integer> map = newStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(map);

    }
}
