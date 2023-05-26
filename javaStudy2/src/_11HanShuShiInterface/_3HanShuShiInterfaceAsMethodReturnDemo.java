package _11HanShuShiInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//函数式接口作为方法的返回值
public class _3HanShuShiInterfaceAsMethodReturnDemo {
    public static void main(String[] args) {
        //构造使用场景

        //定义集合 存储字符串元素
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("cccc");
        arrayList.add("aa");
        arrayList.add("b");
        arrayList.add("dddddd");
        System.out.println("排序前："+arrayList);

       // Collections.sort(arrayList);

        Collections.sort(arrayList,getComparator());
        System.out.println("排序后："+arrayList);



    }

    static Comparator<String> getComparator(){
        //匿名内部类的方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };
//
//        return comp;
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };


        //Lambda
//        return (String s1,String s2)->{
//          return s1.length()-s2.length();
//        };

//再简化
        return (s1,s2)->s1.length()-s2.length();
    }
}
