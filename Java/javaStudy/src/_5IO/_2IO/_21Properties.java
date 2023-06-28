package _5IO._2IO;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Properties;
import java.util.Set;

public class _21Properties {
    public static void main(String[] args) {

        //错误的
        // Properties<String,String> prop = new Properties<String,String>();

        Properties prop = new Properties();

        prop.put("001","zhuHwoWen");
        prop.put("002","xiaoLu");
        prop.put("003","Apple");

        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
        System.out.println(prop);
        System.out.println("--------------");
        Properties properties = new Properties();
        properties.setProperty("--1","ZHW");
        properties.setProperty("--2","XL");
        properties.setProperty("--3","zhy");
        System.out.println(properties.getProperty("--1"));
        System.out.println(properties.getProperty("001"));

        Set<String> names = properties.stringPropertyNames();
        for(String key:names){
            //System.out.println(key);
            String value = properties.getProperty(key);
            System.out.println(key+","+value);

        }


        System.out.println(properties);
    }
}
