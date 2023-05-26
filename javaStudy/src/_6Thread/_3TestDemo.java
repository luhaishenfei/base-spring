package _6Thread;

public class _3TestDemo {
    public static void main(String[] args) {
        _3MyRunnable myRunnable1= new _3MyRunnable();
        _3MyRunnable myRunnable2= new _3MyRunnable();
        _3MyRunnable myRunnable3= new _3MyRunnable();

        Thread t1 = new Thread(myRunnable1,"飞机");
        Thread t2 = new Thread(myRunnable2,"高铁");
        Thread t3 = new Thread(myRunnable3,"汽车");

        t1.start();
        t2.start();
        t3.start();

    }
}
