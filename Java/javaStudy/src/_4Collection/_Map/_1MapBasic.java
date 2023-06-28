package _4Collection._Map;

import java.util.*;

public class _1MapBasic {
    public static void main(String[] args) {
        Map<String,String> myFirstMap = new HashMap<>();
        myFirstMap.clear();
        myFirstMap.put("No1","XiaoLu");
        myFirstMap.put("No2","mySelf");
        myFirstMap.put("No2","ZhuHaoWen");
        myFirstMap.remove("No2");
        myFirstMap.put("No2","ZhuHaoWen");

        myFirstMap.containsKey("");
        myFirstMap.containsValue("");
        myFirstMap.isEmpty();
        System.out.println(myFirstMap);
        System.out.println(myFirstMap.size());

        //遍历 方式1
        Set<String> mapKey = myFirstMap.keySet();
        for (String s :
                mapKey) {
            System.out.println(myFirstMap.get(s));
        }

        Collection<String> mapValue = myFirstMap.values();
        for (String s :
                mapValue) {
            System.out.println(s);
        }
        System.out.println("----");
        //遍历 方式二 获取集合
        Set<Map.Entry<String, String>> entries = myFirstMap.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> map:
             entries) {
            System.out.println(map.getKey()+","+map.getValue());
        }
    }
}
