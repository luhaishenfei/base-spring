package _13Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class _4ReflectField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("_13Class._2Student");

//        c.getField();
//        Field[] declaredFields = c.getDeclaredFields();   
        Field[] fields = c.getDeclaredFields();
        for (Field field :
                fields) {
            System.out.println(field);
        }
        System.out.println("---------");


        Field addressField = c.getField("address");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        obj.addressField="xiAn";
        addressField.set(obj, "xiAn");//给obj的成员变量addressField赋值为XiAn
        System.out.println(obj);


//        _2Student s =new _2Student();
//        s.address = "xiAn";
//        System.out.println(s.address);


    }
}
