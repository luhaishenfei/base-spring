package _6Thread;

public class _6TestDemo {
    public static void main(String[] args) {
        _6ThreadLock threadLockTest = new _6ThreadLock();
        Thread sellTicketsLock1= new Thread(threadLockTest);
        Thread sellTicketsLock2= new Thread(threadLockTest);
        Thread sellTicketsLock3= new Thread(threadLockTest);

        sellTicketsLock1.start();
        sellTicketsLock2.start();
        sellTicketsLock3.start();
    }
}
