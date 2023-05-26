package LittlePrograme;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1CountStringCharTimes {
    public static void main(String[] args) {
        String s = "aaaaaa";
        countCharTimes(s);
    }

    public static void countCharTimes(String str){
        char[] chars = str.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        for (char c:
             chars) {
            if (countMap.containsKey(c)){
                int a =countMap.get(c);
                a++;
                countMap.replace(c,a);
            }else {
                countMap.put(c,1);

            }
        }
        Set<Map.Entry<Character, Integer>> entries = countMap.entrySet();
        for (Map.Entry<Character, Integer> map:
             entries) {
            System.out.print(map.getKey()+"("+map.getValue()+")");
        }

    }
}
