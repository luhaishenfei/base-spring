package _13Class;

public class _1ClassLoader {
    public static void main(String[] args) {
        //
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);//AppClassLoader

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);//PlatformClassLoader

        ClassLoader parentParent = parent.getParent();
        System.out.println(parentParent);


    }
}
