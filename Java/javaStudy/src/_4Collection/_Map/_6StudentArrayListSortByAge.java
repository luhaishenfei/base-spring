package _4Collection._Map;

import _1ObjectMethod.Student;
import _4Collection._1Collection._3Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _6StudentArrayListSortByAge {
    public static void main(String[] args) {
        ArrayList<_3Student> studentList = new ArrayList<>();

        _3Student student1= new _3Student("ZhuHaoWen",23);
        _3Student student2= new _3Student("XiaoLu",25);
        _3Student student3= new _3Student("ZhuHaoYue",14);
        _3Student student4= new _3Student("XiaoLu",18);
        _3Student student5= new _3Student("NiHao",18);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //studentList =sortByAge(studentList);
        Collections.sort(studentList);
        for (int i = 0 ;i<studentList.size();i++){
            studentList.get(i).introduce();
        }
    }

    public static List<_3Student> sortByAge(List<_3Student> arrayList){



        return arrayList;
    }
}
