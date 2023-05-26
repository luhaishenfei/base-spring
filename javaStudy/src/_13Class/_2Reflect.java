package _13Class;

public class _2Reflect {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<_2Student> c1 = _2Student.class;
        System.out.println(c1);

        Class<_2Student> c2 = _2Student.class;
        System.out.println(c1==c2);
        System.out.println("-----------");

        _2Student s = new _2Student();
        Class<? extends _2Student> c3 = s.getClass();
        System.out.println(c1==c3);
        System.out.println("-----------");

        Class<?> c4 = Class.forName("_13Class._2Student");
        System.out.println(c1==c4);

        //

    }
}
