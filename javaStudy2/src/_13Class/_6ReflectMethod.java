package _13Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class _6ReflectMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("_13Class._2Student");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println(m);
        }
        System.out.println("----");

        Method method1 = c.getMethod("method1");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        Object invoke(Object obj, Object... args)
//        在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        method1.invoke(obj);

        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(obj,"---");

        Method method3 = c.getMethod("method3", String.class, int.class);
        Object o=method3.invoke(obj,"zhuhaowen",23);
        System.out.println(o);
        System.out.println("----");

        Method toString = c.getMethod("toString");
        Object o1 = toString.invoke(obj);
        System.out.println(o1);

        //function方法不是公共的
        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(obj);


    }
}
