package _6Thread;

public class _2ThreadJoin extends Thread{
    public _2ThreadJoin(){}

    public _2ThreadJoin(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);

        }
    }

}
