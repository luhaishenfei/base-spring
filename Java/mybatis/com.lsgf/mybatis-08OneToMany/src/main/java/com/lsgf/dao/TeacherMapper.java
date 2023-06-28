package com.lsgf.dao;

import com.lsgf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacherList();

    Teacher getTeacherByID(@Param("tid") int id);

    Teacher getTeacherByID2(@Param("tid") int id);

    List<Teacher> getTeacher_sStudentList();
}
