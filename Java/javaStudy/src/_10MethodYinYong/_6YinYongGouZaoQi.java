package _10MethodYinYong;

//引用构造器（构造方法）
public class _6YinYongGouZaoQi {
    public static void main(String[] args) {
        useStudentBuilder((String name,int age)->{
            _6Student s= new _6Student(name,age);
            return s;
        });

        useStudentBuilder((name,age)->new _6Student(name,age));

        //方法引用改进 引用构造器
        useStudentBuilder(_6Student::new);
    }


    private static void useStudentBuilder(_6StudentBuilder sb){
       _6Student s= sb.bulide("ZhuHaoWen",23);
        System.out.println(s.getAge()+s.getName());
    }
}
