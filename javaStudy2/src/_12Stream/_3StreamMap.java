package _12Stream;

import java.util.ArrayList;

public class _3StreamMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //将集合字符串转换为整数后输出
        //       list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);

//        list.stream().map(Integer::parseInt).forEach(System.out::println);

//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

//        int result = list.stream().mapToInt(Integer::parseInt).sum();
//        System.out.println(result);

        long count = list.stream().count();
        System.out.println(count);
    }
}
