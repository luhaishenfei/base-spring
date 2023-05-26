package _10MethodYinYong;

public class _2PrintableIntDemo {
    public static void main(String[] args) {

        usePrintableInt(i-> System.out.println(i));

        //方法引用
        usePrintableInt(System.out::println);
    }

    private static void usePrintableInt(_2PrintableInt p){
        p.printInt(666);
    }

}
