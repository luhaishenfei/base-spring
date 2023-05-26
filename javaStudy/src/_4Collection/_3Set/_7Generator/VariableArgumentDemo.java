package _4Collection._3Set._7Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class VariableArgumentDemo {
    public static void main(String[] args) {
        VariableArgument va = new VariableArgument();
        System.out.println(va.sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println("----");
       //
        List<String> list = Arrays.asList("hello", "world", "java");
       //不可行 list.add("javaee");
       // list.remove("world");
        list.set(1,"zhuHaowen");

        System.out.println(list);

        //List<String> listof =  List.of("hello","world","java");
        //Set<String> setof =  Set.of("hello","world","java");

    }



}
