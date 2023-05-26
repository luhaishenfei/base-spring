package _4Collection._Map;

import java.util.*;

public class _3ArrayListHashMap {
    public static void main(String[] args) {
        List<HashMap<String,String >> alhs= new ArrayList<>();

        HashMap<String,String> hm1= new HashMap<>();
        hm1.put("ZhuHaoWen","朱浩闻");
        hm1.put("XiaoLu","肖露");

        HashMap<String,String> hm2= new HashMap<>();
        hm2.put("mini","宝马mini");
        hm2.put("R8","奥迪R8");

        HashMap<String,String> hm3= new HashMap<>();
        hm3.put("changSha","长沙");
        hm3.put("guangzhou","广州");

        alhs.add(hm1);
        alhs.add(hm2);
        alhs.add(hm3);
        //遍历方式二
        for (HashMap<String,String> map:
             alhs) {
            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entryMap:
               entries  ) {
                System.out.println(entryMap.getKey()+"-"+entryMap.getValue());
            }
        }
        System.out.println("---------------");
        //遍历方式一
        for(HashMap<String ,String> map : alhs){
            Set<String> keySet = map.keySet();
            for (String s:keySet
                 ) {
                String value = map.get(s);
                System.out.println(s+"-"+value);
            }
        }
    }
}
