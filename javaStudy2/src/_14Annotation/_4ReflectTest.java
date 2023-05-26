package _14Annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//更改注解 调整获取的对象(示范是class ，method、Field也可以）
@_4MyAnno(className ="_14Annotation._4Person",methodName = "show")
public class _4ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<_4ReflectTest> reflectTestClass = _4ReflectTest.class;
        //2.获取上面的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
        *  public class _4AnnoImpl implements _4Anno{
        *     public String className(){
        *
        *       return "_14Annotation._4Person";
        * }
        * public String methodName(){
         *
         *      retrun "method";
         * }
        *
        *
        * }
        * */
        _4MyAnno an = reflectTestClass.getAnnotation(_4MyAnno.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className= an.className();
        String methodName= an.methodName();
        System.out.println(className+" "+methodName);

        Class<?> c = Class.forName(className);
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(obj);

    }
}
