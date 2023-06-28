package _13Class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class _8Reflect {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
                class.txt
                className=xxx
                methodName=xxx
         */

        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\_13Class\\_8.txt");
        prop.load(fr);
        fr.close();



        Class<?> c = Class.forName(prop.getProperty("className"));
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method methodName = c.getMethod(prop.getProperty("methodName"));
        methodName.invoke(obj);



    }
}
