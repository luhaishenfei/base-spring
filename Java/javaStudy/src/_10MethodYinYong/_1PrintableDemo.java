package _10MethodYinYong;

public class _1PrintableDemo {
    public static void main(String[] args) {
//        usePrintable((String s)->{
//            System.out.println(s);
//        });

        usePrintable(s -> System.out.println(s));

        //方法引用符 ：：
        usePrintable(System.out::println);

        //可推导的就是可省略的
    }

    public static void usePrintable(_1Printable p){
        p.printString("HelloWorld");
    }

}
