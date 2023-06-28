package _6Thread;

public class _2ThreadDaemon extends Thread{
    public _2ThreadDaemon(){}

    public _2ThreadDaemon(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+":"+i);

        }
    }
}
