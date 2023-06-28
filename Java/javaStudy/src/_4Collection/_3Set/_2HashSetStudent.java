package _4Collection._3Set;

import _4Collection._1Collection._3Student;

import java.util.HashSet;

public class _2HashSetStudent {
    public static void main(String[] args) {
        _3Student student1= new _3Student("ZhuHaoWen",23);
        _3Student student2= new _3Student("XiaoLu",25);
        _3Student student3= new _3Student("ZhuHaoYue",14);
        _3Student student4= new _3Student("XiaoLu",18);
        _3Student student5= new _3Student("XiaoLu",18);

        HashSet<_3Student> studentHashSet = new HashSet<>();
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);

        System.out.println(student4.equals(student5));

        for (_3Student student:studentHashSet
             ) {
            student.introduce();
            System.out.println("-----");

        }



    }
}
