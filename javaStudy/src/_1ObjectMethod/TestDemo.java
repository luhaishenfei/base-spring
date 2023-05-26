package _1ObjectMethod;

public class TestDemo {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        for(int i = 0;i<10000;i++){
            System.out.println(i);
        }
        l= System.currentTimeMillis()-l;
        System.out.println(l);

        System.out.println("HelloWorld");
        System.out.println(args.toString());
        System.exit(0);
    }

    @Override
    public String toString() {
        return "_1ObjectMethod.TestDemo{}";
    }
}
