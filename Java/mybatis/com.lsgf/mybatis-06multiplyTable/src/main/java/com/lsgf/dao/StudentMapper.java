package com.lsgf.dao;

import com.lsgf.pojo.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentMapper {

    //查询所有学生信息，以及对应的老师的信息
//    select s.id,s.name,t.name from student s,teacher t where s.tid = t.id
    List<Student> getStudentList();

    List<Student> getStudentListPlus();


}
