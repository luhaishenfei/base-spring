package _8Lambda;

public class _1Basic {
    public static void main(String[] args) {
//        _1Runnable runnable = new _1Runnable();
//        Thread t1 = new Thread(runnable);
//        t1.start();

        //匿名内部类 的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程方法启动了");
//            }
//        }).start();

        //Lambda表达式的方式改进
        new Thread(() -> {
            System.out.println("多线程方法启动了");
        }).start();
    }
}
