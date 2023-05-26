package _10MethodYinYong;

//引用类的实列方法
public class _5YinYongClassDeShiLieMethod {
    public static void main(String[] args) {
//        useMyString((String s,int x, int y)->{
//            return s.substring(x,y);
//        });
        useMyString((s,x,y)->s.substring(x,y));

        //引用类中的实列方法
        useMyString(String::substring);
        //Lambda表达式被类的实例方法代替的时候
//        第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(_5MyString my){
        String s= my.mySubString("HelloWorld",2,5);
        System.out.println(s);
    }
}
