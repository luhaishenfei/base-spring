package _13Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class _5ReflectFiledDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("_13Class._2Student");
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        System.out.println(obj);


        Field addressField =  c.getField("address");
        addressField.set(obj,"ChangSha");


        Field ageField = c.getDeclaredField("age");
        ageField.set(obj,23);


        Field nameField = c.getDeclaredField("name");
        //暴力破解
        nameField.setAccessible(true);
        nameField.set(obj,"zhuHaoWen");



        System.out.println(obj);
    }
}
