package _11HanShuShiInterface;

import java.util.function.Consumer;

public class _6ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("ZhuHaoWen",(String s)->{
//            System.out.println(s);
//        });

        //operatorString("ZhuQingxia",s-> System.out.println(s));

        //方法引用改进
        operatorString("Zhuhaowen", System.out::println);

        operatorString("Zhuhaowen", s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });

        operatorString("ZhuHaoWen", s -> System.out.println(new StringBuilder(s).reverse().toString()));

        System.out.println("----------");
        operatorString("ZhuHaoWen",s-> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);

    }

    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);

        con1.andThen(con2).accept(name);
    }

    }
