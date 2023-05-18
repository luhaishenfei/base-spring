package dao;
//
import com.lsgf.dao.StudentMapper;
import com.lsgf.dao.TeacherMapper;
import com.lsgf.pojo.Student;
import com.lsgf.pojo.Teacher;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teacherList = mapper.getTeacherList();

            for (Teacher teacher :
                    teacherList) {
                System.out.println(teacher.toString());
            }

            sqlSession.close();
    }

    @Test
    public void getTeacherByIDTest(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherByID(1);
            System.out.println(teacher.toString());
        sqlSession.close();
    }

    @Test
    public void getTeacherByID2Test(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherByID2(1);
        System.out.println(teacher.toString());
        sqlSession.close();
    }


    @Test
    public void testGetStudent(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList();

        for (Student student :
                studentList) {
            System.out.println(student.toString());
        }

        sqlSession.close();
    }

    @Test
    public void testGetStudentPlus(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentListPlus();

        for (Student student :
                studentList) {
            System.out.println(student.toString());
        }

        sqlSession.close();
    }



}

