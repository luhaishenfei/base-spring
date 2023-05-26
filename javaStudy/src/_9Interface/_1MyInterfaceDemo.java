package _9Interface;

public class _1MyInterfaceDemo {
    public static void main(String[] args) {
        _1MyInterface my = new _1MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();

        _1MyInterface.show();
    }
}
