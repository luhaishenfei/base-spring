package _8Lambda;

import static _8Lambda._3FlyableIDemo.useFlyable;

public class _4AddableDemo {
    public static void main(String[] args) {
        //使用Lambda必须要有接口 并且要求接口中有且仅有一个抽象方法

        //Lambda
        useAddable((int i, int j) -> {

            return i + j;
        });

        //参数的类型可以省略 不能只省略一个
        //Lambda
        useAddable((i, j) -> {

            return i + j;
        });

        //如果参数有且仅有一个 小括号也可以省略
        useFlyable(s -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

        //如果代码块的语句只有一条 可以省略大括号和分号
        useFlyable(s -> System.out.println(s));

        //如果代码块的语句只有一条 可以省略大括号和分号 如果有return return也要省略掉
        useAddable((x,y)->x+y);

        Runnable r= ()-> System.out.println("aa");
        new Thread(r).start();

        //
        new Thread(()-> System.out.println("nihao")).start();
    }

    private static void useAddable(_4Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
