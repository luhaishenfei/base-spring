package _12Stream;

import java.util.ArrayList;

public class _1StreamBasic {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("朱浩月");
        arrayList.add("朱浩闻");
        arrayList.add("肖露");
        arrayList.add("朱露");
        arrayList.add("朱红伟");
        arrayList.add("马英");

        ArrayList<String> familyZhuArray = new ArrayList<>();
//        for (String s :
//                arrayList) {
//            StringBuilder stringBuilder = new StringBuilder(s);
//            if (stringBuilder.charAt(0)=='朱'){
//                familyZhuArray.add(s);
//            }
//        }

        for (String s :
                arrayList) {
            if (s.startsWith("朱")) {
                familyZhuArray.add(s);
            }
        }

        System.out.println(familyZhuArray);
        ArrayList<String> newArray=new ArrayList<>();

        for (String s :
                familyZhuArray) {
            if (s.length()==3) {
                newArray.add(s);
            }
        }
        System.out.println(newArray);

        System.out.println("------");
        //Stream流改写 Stream流把真正的函数式风格引入Java中
        arrayList.stream().filter(s ->s.startsWith("朱")).filter(s->s.length()==3).forEach(System.out::println);




    }
}
