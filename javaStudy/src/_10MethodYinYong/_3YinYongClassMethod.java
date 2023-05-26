package _10MethodYinYong;

public class _3YinYongClassMethod {
    public static void main(String[] args) {
//        useConverter((String s)->{
//            return Integer.parseInt(s);
//        });
        //优化 Lambda
        useConverter(s->Integer.parseInt(s));

        //引用类方法的方式
        useConverter(Integer::parseInt);
        //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数

    }

    private static void useConverter(_3Converter converter){
        int number =converter.convert("100");
        System.out.println(number);

    }
}
