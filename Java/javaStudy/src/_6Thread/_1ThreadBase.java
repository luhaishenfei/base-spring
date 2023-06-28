package _6Thread;

public class _1ThreadBase {
    public static void main(String[] args) {

        _1MyThread myThread1 = new _1MyThread();
        _1MyThread myThread2 = new _1MyThread();
        _1MyThread myThread3 = new _1MyThread("mt3");



        //wrong
//        myThread1.run();
//        myThread2.run();

        myThread1.setName("mt1");
        myThread2.setName("mt2");

        //默认为5  优先级高是获取cpu使用的机率更高
        System.out.println(myThread1.getPriority());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        //
        myThread1.setPriority(1);
        myThread2.setPriority(2);
        myThread3.setPriority(3);

        myThread1.start();
        myThread2.start();
        myThread3.start();
//返回对当前正在执行的现场对象的引用
        System.out.println(Thread.currentThread().getName());

    }
}
