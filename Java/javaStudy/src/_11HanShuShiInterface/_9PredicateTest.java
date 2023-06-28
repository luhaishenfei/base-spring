package _11HanShuShiInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class _9PredicateTest {
    public static void main(String[] args) {

        String[] strArray = {"林青霞,30", "张曼玉,35", "貂蝉,31", "王祖贤,33",};

//        ArrayList<String> arrayList=checkString(strArray,(String name)->{
//            String s1 = name.split(",")[0];
//            return s1.length()>2;
//        },(String age)->{
//            int s1 = Integer.parseInt(age.split(",")[1]);
//            return s1>33;
//        });

        //简化后
        ArrayList<String> arrayList = checkString(strArray, name -> name.split(",")[0].length() > 2, age -> Integer.parseInt(age.split(",")[1]) > 33);


        System.out.println(arrayList);


    }

    private static ArrayList<String> checkString(String[] strArray, Predicate<String> preName, Predicate<String> preAge) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s :
                strArray) {
            if (preName.and(preAge).test(s)) {
                arrayList.add(s);
            }
        }

        return arrayList;
    }
}
