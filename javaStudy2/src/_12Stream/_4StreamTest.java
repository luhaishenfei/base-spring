package _12Stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class _4StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manArr = new ArrayList<>();
        manArr.add("朱浩闻");
        manArr.add("朱红伟");
        manArr.add("贝爷");
        manArr.add("猴子");
        manArr.add("容嘉贝");
        manArr.add("周子扬");

        ArrayList<String> womanArr = new ArrayList<>();
        womanArr.add("肖露");
        womanArr.add("朱露");
        womanArr.add("马英");
        womanArr.add("朱皓玥");
        womanArr.add("朱露娜");
        womanArr.add("朱昭君");

        Stream<String> newMan = manArr.stream().filter(s->s.length()==3).limit(3);
        Stream<String> newWoman = womanArr.stream().filter(s -> s.startsWith("朱")).skip(1);

        //Stream.concat(newMan,newWoman).forEach(System.out::println);

//        Stream.concat(newMan,newWoman).map((String s)->{
//           _4Actor actor = new _4Actor(s);
//            System.out.println("----");
//            System.out.println(actor.getName());
//            return actor;
//        }).forEach(System.out::println);

        Stream<String> myStream = Stream.concat(newMan, newWoman);
        myStream.map(_4Actor::new).forEach(p-> System.out.println(p.getName()));

    }
}
