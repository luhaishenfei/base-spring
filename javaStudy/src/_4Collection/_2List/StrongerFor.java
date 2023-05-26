package _4Collection._2List;

import _4Collection._1Collection._3Student;

import java.util.ArrayList;
import java.util.List;

public class StrongerFor {
    public static void main(String[] args) {
        _3Student student1 = new _3Student("zhuHaoWen",23);
        _3Student student2 = new _3Student("xiaoLu",25);
        _3Student student3 = new _3Student("zhuHaoYue",15);

        List<_3Student> studentList= new ArrayList<_3Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //strongerFor
        for (_3Student s:studentList
             ) {
            s.introduce();
        }

        System.out.println("----  ");
        int[] arr = {1,2,3,4,5,6,};
        for (int i:arr
             ) {
            System.out.println(i);
        }


    }
}
