package _11HanShuShiInterface;

import java.util.function.Supplier;

public class _4Supplier {
    public static void main(String[] args) {
//        String s=   getString(()->{
//           return "ZhuHaoWen";
//        });
        String s = getString(()-> "ZhuHaoWen");

        System.out.println(s);

        Integer i = getInteger(()->30);

        System.out.println(i);
    }

    //定义一个方法，返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }


    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
