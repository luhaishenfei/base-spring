package _6Thread;

public class _1MyThread extends Thread {
   public _1MyThread(){}

   public _1MyThread(String name){
        super(name);
   }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
