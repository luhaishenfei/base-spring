package _6Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _6ThreadLock implements  Runnable{
    private int tickets = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();

                if (tickets > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }

                    System.out.println(Thread.currentThread().getName() + " had sell " +tickets + " ticket");
                    tickets--;

                } else {
                    //      System.out.println("tickets sell out");

                }
            }finally {
                lock.unlock();
            }


        }
    }
}
