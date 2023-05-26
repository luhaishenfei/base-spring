package _11HanShuShiInterface;

import java.util.function.Function;

public class _10FunctionBase {
    public static void main(String[] args) {
//        convert("100",(String s)->{
//            return  Integer.parseInt(s);
//        });

        convert("100", s -> Integer.parseInt(s));
        convert("100", Integer::parseInt);

        System.out.println("----------");
        convert(100, i -> String.valueOf(i + 5));

        System.out.println("--------");
       // convertStr("100",s -> String.valueOf(Integer.parseInt(s) + 5));
        convertStr("100",(String s)->Integer.parseInt(s)+5,(Integer i)->String.valueOf(i));
    }

    //定义一个方法 把一个字符串转换int类型 把int加上一个整数后 转为字符串在控制台输出
//    private static void convertStr(String s, Function<String, String> fun) {
//        String str = fun.apply(s);
//        System.out.println(str);
//    }

    //定义一个方法 把一个字符串转换int类型 把int加上一个整数后 转为字符串在控制台输出
    private static void convertStr(String s, Function<String, Integer> fun1,Function<Integer,String> fun2) {
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }

    //定义一个方法 把int类型的数据加上一个整数之后 转为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    //定义一个方法 把string转换成int
    private static void convert(String s, Function<String, Integer> fun) {
        //      Integer i=fun.apply(s);
        int i = fun.apply(s);
        System.out.println(i);
    }
}
