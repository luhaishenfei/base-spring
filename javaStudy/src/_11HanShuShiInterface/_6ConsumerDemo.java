package _11HanShuShiInterface;

import java.util.function.Consumer;

public class _6ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("ZhuHaoWen",(String s)->{
//            System.out.println(s);
//        });
        operatorString("ZhuQingxia",s-> System.out.println(s));
    }

    //定义一个方法，消费一个字符串数据
    private  static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
