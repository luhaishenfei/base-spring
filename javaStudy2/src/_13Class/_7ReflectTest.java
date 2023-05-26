package _13Class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class _7ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //在ArrayList<Integer> 中添加一个字符串数据
        ArrayList<Integer> integerArrayList =
                new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        integerArrayList.add(0);
//        integerArrayList.add("hello");
        System.out.println(integerArrayList);

        Class<? extends ArrayList> c = integerArrayList.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(integerArrayList,"hello");
        m.invoke(integerArrayList,"world");
        m.invoke(integerArrayList,"java");

        System.out.println(integerArrayList);


    }
}
