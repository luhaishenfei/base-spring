package _4Collection._2List;

import _4Collection._1Collection._3Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorDemo {
    public static void main(String[] args) {

        _3Student student1 = new _3Student("zhuHaoWen",23);
        _3Student student2 = new _3Student("xiaoLu",25);
        _3Student student3 = new _3Student("zhuHaoYue",15);

        List<_3Student>  studentList= new ArrayList<_3Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        ListIterator<_3Student> listIterator = studentList.listIterator();
        while (listIterator.hasNext()){
            _3Student student = listIterator.next();
            student.introduce();
            System.out.println("----introduce over------");
        }

        ListIterator<_3Student> listIterator2 = studentList.listIterator();
        while (listIterator2.hasNext()){
            System.out.println("!!!!!!!!!!!!");

            _3Student student = listIterator2.next();
            if (student.getName()=="xiaoLu"){
            listIterator2.add(new _3Student("bingFaExpection",-1));
            System.out.println("!!!!!!!bingFa Expection over!!!!!!!!!!");

            }
            System.out.println("----while over------");

        }
   }
}
