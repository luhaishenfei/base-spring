package _9Interface;

public interface _1MyInterface {
    void show1();
    void show2();
  //  void show3();

    //接口中的默认方法
    //public
    default void show3(){
        System.out.println("show 3");
    }

    //接口中的静态方法只能被接口调用  （若可以调用  则当两个接口有相同的静态方法时，编译不知调哪个方法
    public static void show() {
        System.out.println("static show");
    }
//java9
//    private void showp(){
//        System.out.println("Java");
//        System.out.println("C#");
//        System.out.println("Py");
//
//    }
//
//    private static void shows(){
//        System.out.println("java");
//        System.out.println("c#");
//        System.out.println("py");
//    }
}
