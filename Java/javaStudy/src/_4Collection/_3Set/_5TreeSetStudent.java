package _4Collection._3Set;

import _4Collection._1Collection._3Student;


import java.util.Comparator;
import java.util.TreeSet;

public class _5TreeSetStudent {
    public static void main(String[] args) {
        _3Student student1= new _3Student("ZhuHaoWen",23);
        _3Student student2= new _3Student("XiaoLu",25);
        _3Student student3= new _3Student("ZhuHaoYue",18);
        _3Student student4= new _3Student("XiaoLu",18);
        _3Student student5= new _3Student("XiaoLu",18);


// @Override    public int compareTo   this:this  o:上一个元素
        //重写方法时 一定要注意排序规则 必须按照要求的主要条件和次要条件来写

        TreeSet<_3Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);
        studentTreeSet.add(student5);


        for (_3Student student:
                studentTreeSet
             ) {
            student.introduce();
        }

        //匿名内部类Comparator
        TreeSet<_3Student> treeSet= new TreeSet<>(new Comparator<_3Student>() {
            @Override
            public int compare(_3Student s1, _3Student s2) {
                int num = s1.getAge()-s2.getAge();
                /*
                .....
                 */
                return num;
            }
        });
    }
}
