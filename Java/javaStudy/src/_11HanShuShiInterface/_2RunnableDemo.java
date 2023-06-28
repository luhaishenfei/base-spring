package _11HanShuShiInterface;

public class _2RunnableDemo {
    public static void main(String[] args) {
        //匿名内部类的方式
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");

            }
        });

        //Lambda
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));


    }

    /*
    * @FunctionalInterface
public interface Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see     java.lang.Thread#run()

    public abstract void run();
}*/
    static void startThread(Runnable r){
//        Thread t =new Thread(r);
//        t.start();

        new Thread(r).start();

    }
}
