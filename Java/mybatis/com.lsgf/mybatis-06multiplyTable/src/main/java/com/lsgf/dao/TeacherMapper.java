package com.lsgf.dao;

import com.lsgf.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacherList();

    List<Teacher> getTeacher_sStudentList();
}
