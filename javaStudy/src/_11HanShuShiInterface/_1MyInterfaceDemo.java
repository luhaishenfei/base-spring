package _11HanShuShiInterface;

import _11HanShuShiInterface._1MyInterface;

public class _1MyInterfaceDemo {
    public static void main(String[] args) {
        _1MyInterface my = ()-> System.out.println("函数式接口");
        my.show();
    }
}
