package _4Collection._3Set._7Generator;

public class _1GeneratorBasic {
    /*
    泛型 本质是  参数化类型    将类型由原来具体的类型参数化，然后在使用/调用时传入具体的类型
                这种参数类型 可以用在 类、方法和接口中，分别被称为 泛型类、泛型方法、泛型接口
     */
    public static void main(String[] args) {
        GenratorClassTeacher<String> gt1= new GenratorClassTeacher<>();
        gt1.setT("XiaoLu");
        System.out.println(gt1.getT());

        GenratorClassTeacher<Integer> gtcode = new GenratorClassTeacher<>();
        gtcode.setT(25);
        System.out.println(gtcode.getT());

        gt1.show("zhuHaowen");
        gtcode.show(23);


        GenratorMethod gm = new GenratorMethod();
        gm.println("HelloWorld!");
        gm.println(true);
    }

}
