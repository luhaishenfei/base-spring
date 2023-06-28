package _6Thread;

public class _2TestDemo {
    public static void main(String[] args){




//        _2ThreadSleep s1 = new _2ThreadSleep();
//        _2ThreadSleep s2 = new _2ThreadSleep();
//        _2ThreadSleep s3 = new _2ThreadSleep();
//        s1.start();
//        s2.start();
//        s3.start();

//        _2ThreadJoin j1 = new _2ThreadJoin("j1");
//        _2ThreadJoin j2 = new _2ThreadJoin("j2");
//        _2ThreadJoin j3 = new _2ThreadJoin("j3");
//        j1.start();
//        try {
//            j1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        j2.start();
//        j3.start();

        //并不是立即消失
        _2ThreadDaemon d1  = new _2ThreadDaemon("关羽");
        _2ThreadDaemon d2  = new _2ThreadDaemon("张飞");
        Thread.currentThread().setName("刘备");


        d1.setDaemon(true);
        d1.start();

        d2.setDaemon(true);
        d2.start();

        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName()+","+i);
        }


    }
}
