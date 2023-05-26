package _8Lambda;

public class _2EatableDemo {
    public static void main(String[] args) {
//        _2Eatable e= new _2EatableImpl();
//        useEatable(e);

        //匿名内部类
//        useEatable(new _2Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("eat apple");
//            }
//        });

        //Lambda表达式
        useEatable(()->{
            System.out.println("eat apple");
        });

    }

    private static void useEatable(_2Eatable e){
        e.eat();
    }

}
