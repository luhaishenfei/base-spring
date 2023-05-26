package _8Lambda;

public class _3FlyableIDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new _3Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("---------");

        //Lambda
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");


        });
    }

    public static void useFlyable(_3Flyable f){
        f.fly("风和日丽");
    }
}
