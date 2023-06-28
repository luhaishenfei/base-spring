package _4Collection._3Set._7Generator;

import sun.nio.cs.Surrogate;

public class GenratorClassTeacher<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public  void show(T t){

        System.out.println(t);
    }

}
