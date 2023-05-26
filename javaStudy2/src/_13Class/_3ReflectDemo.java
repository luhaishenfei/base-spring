package _13Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class _3ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1
        Class<?> c = Class.forName("_13Class._2Student");

        Constructor<?>[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        Constructor<?>[] constructor = c.getDeclaredConstructors();
        for (Constructor con :
                constructor) {
            System.out.println(con);
        }
        System.out.println("-------");

        //2
        Constructor<?> con = c.getConstructor();

//        _2Student s = new _2Student();
//        System.out.println(s);

        //3
        Object obj = con.newInstance();
        System.out.println(obj);
        System.out.println("----------");

//
        Class<?> c1 = Class.forName("_13Class._2Student");

        //public _2Student(String name, int age, String address) {
        //基本数据类型也可以通过.class得到对应的class类型
        Constructor<?> constructor1 = c1.getConstructor(String.class, int.class, String.class);
        Object o = constructor1.newInstance("zhuHaoWen", 23, "ChangSha");
        System.out.println(o);
        _2Student s = (_2Student) o;
        System.out.println(s.age);

        System.out.println("-------------");


        //
        Class<?> c2 = Class.forName("_13Class._2Student");
        Constructor<?> declaredConstructor = c2.getDeclaredConstructor(String.class, int.class);
        Object xiaoLu = declaredConstructor.newInstance("XiaoLu", 22);
        System.out.println(xiaoLu);

//        //private导致出错
//        Class<?> c3 = Class.forName("_13Class._2Student");
//        Constructor<?> declaredConstructor3 = c2.getDeclaredConstructor(String.class);
//        Object xiaoLu3 = declaredConstructor3.newInstance("XiaoLu");
//        System.out.println(xiaoLu3);

        //暴力反射
        Class<?> c3 = Class.forName("_13Class._2Student");
        Constructor<?> declaredConstructor3 = c2.getDeclaredConstructor(String.class);
        //暴力反射 取消访问检查
        declaredConstructor3.setAccessible(true);

        Object xiaoLu3 = declaredConstructor3.newInstance("XiaoLu");
        System.out.println(xiaoLu3);
    }
}
