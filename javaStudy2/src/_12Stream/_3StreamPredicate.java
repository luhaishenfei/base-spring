package _12Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _3StreamPredicate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("朱浩月");
        list.add("朱浩闻");
        list.add("肖露");
        list.add("朱露");
        list.add("朱红伟");
        list.add("马英");

        //把list集合中以 朱 开头的元素在控制台输出
//        list.stream().filter((String s)->{
//            return s.startsWith("朱");
//        }).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("朱")).forEach(System.out::println);

        System.out.println("----");
        //把list中长度为3的元素在集合中输出
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("----");

        //把以朱开头 长度为3的
        list.stream().filter(s -> s.startsWith("朱")).filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("----");

        //取前三个数据输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----");

        //跳过3个元素 把剩下的输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----");

        //跳过2个元素 把剩下的元素中的前2个输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("00000000");

        //取前4个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);

        //跳过2个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        //合并前面两个流s1 s2  并把结果在控制台输出
        //Stream.concat(s1,s2).forEach(System.out::println);

        System.out.println("----");
        //合并s1 s2 要求字符串元素不能重复
        //不注释之前的会出错
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
        System.out.println("---sorted-----");
        //按照字母顺序输出
        //list.stream().sorted().forEach(System.out::println);
        //按照字符串长度输出
        list.stream().sorted((str1, str2) -> {
            int num = str1.length() - str2.length();
            int num2 = num==0?str1.compareTo(str2):num;
            return num2;
        }).forEach(System.out::println);

    }
}
