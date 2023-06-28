package _1ObjectMethod;

public class ObjectEqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhuHaoWen",23);
        Student s2 = new Student( "zhuHaoWen",23);
        System.out.println(s1.equals(s2));

        String zhangSan,liSi;
        zhangSan = new String("woShiZhangSan");
        liSi = new String("woShiliSi");
        System.out.println(zhangSan==liSi);
        zhangSan = liSi;
        System.out.println(zhangSan==liSi);
        if(false){}else if (true){

        }
    }
}
