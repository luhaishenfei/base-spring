package _4Collection._Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _5Collections {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ZhuHaoWen");
        stringList.add("XiaoLu");
        stringList.add("ZHY");
        stringList.add("s1");
        stringList.add("s2");
        stringList.add("s3");
        stringList.add("s4");
        stringList.add("s5");
        stringList.add("s6");
        stringList.add("s7");
        stringList.add("s2");
        stringList.add("s8");
        stringList.add("s9");
        System.out.println(stringList);


        Collections.reverse(stringList);
        System.out.println(stringList);

        Collections.shuffle(stringList);
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);

    }
}
