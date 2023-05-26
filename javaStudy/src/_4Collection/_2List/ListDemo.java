package _4Collection._2List;

import _4Collection._1Collection._3Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static  void sortListElement(List<_3Student> student){
        Iterator<_3Student> studentIterator= student.listIterator();

        while (studentIterator.hasNext()){
            studentIterator.next().introduce();
        }
        System.out.println("----over------");
    }

    public static void forSortListElement(List<_3Student> student){
        for (int i = 0; i < student.size(); i++) {
            student.get(i).introduce();
        }
        System.out.println("----version of for is over-----");
    }


    public static void main(String[] args) {

        _3Student student1 = new _3Student("zhuHaoWen",23);
        _3Student student2 = new _3Student("xiaoLu",25);
        _3Student student3 = new _3Student("zhuHaoYue",15);
        _3Student student4 = new _3Student("----",25);


        List<_3Student> studentList = new ArrayList<_3Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student1);
        sortListElement(studentList);
        studentList.remove(4);
        sortListElement(studentList);
        studentList.set(studentList.size()-1,new _3Student("newGay",11));
        forSortListElement(studentList);

        System.out.println("-----");
        studentList.get(studentList.size()-1).introduce();

    }
}
