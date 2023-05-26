package _10MethodYinYong;

//引用对象的实列方法

import java.sql.SQLOutput;
import java.util.Locale;

public class _4YinYongDuiXiangDeShiLieMethod {
    public static void main(String[] args) {
//        "HelloWorld"::toUpperCase;


        usePrint((String s)->{
//           String result=   s.toUpperCase();
//            System.out.println(result);
            System.out.println(s.toUpperCase());
        });
        //最终简写
        usePrint(s-> System.out.println(s.toUpperCase()));

        //方法引用 引用对象的实列
        _4PrintString ps = new _4PrintString();
        usePrint(ps::printUpper);
        //Lambda表达式被对象的实列方法替代的时候，他的形式参数全部传递给该方法作参数
    }

    static void usePrint(_4Printer p){
        p.printUpperCase("HelloWorld");
    }
}
