package _6Thread;

public class _2ThreadSleep extends Thread{
    public _2ThreadSleep(){}

    public _2ThreadSleep(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()+":"+i);
            //1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
