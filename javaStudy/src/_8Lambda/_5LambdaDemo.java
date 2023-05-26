package _8Lambda;

public class _5LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        useInter(new _5Inter() {
            @Override
            public void show() {
                System.out.println("interface");
            }
        });

        useAnimal(new _5Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new _5Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        //Lambda
        useInter(()-> System.out.println("接口"));
        //
        //useAnimal(()-> System.out.println("抽象类"));
        //useStudent(()-> System.out.println("具体类"));

    }

    private static void useStudent(_5Student s){
        s.study();
    }

    private static void useAnimal(_5Animal a){
        a.method();
    }

    private static void useInter(_5Inter i){
        i.show();
    }
}
