package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _1JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123");
        //4.定义sql语句
        String sql ="update stu set NAME = \"zhuhaowen\" where id >1";
        sql = "insert into stu(id,NAME) values(100,\"xiaolu\")";
        //5.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count =  stmt.executeUpdate(sql);

        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }

    /*
    *
    *1.DriverManager:驱动管理对象
    *   功能：
    *       1.注册驱动
    *                   DriverManager.registerDriver();

     *       2.获取数据库连接
    * 2.Connection:数据库连接对象
    *      功能：
    *           获取执行sql的对象
    *                Statement createStatement()
     *              PreparedStatement prepareStatement(String sql)
     *          管理事务
     *                  //开启事务
     *                 setAutoCommit(boolean autoCommit)
     *                  //提交事务
     *                  commit()
     *                    //回滚事务
     *                    rollback()
     *
    * 3.Statement:执行sql的对象
    *           1.执行sql
    *               1.boolean execute（String sql）   了解  执行任意sql语句
    *               2.int executeUpdate(String sql) 执行DML(insert,update,delete)语句、DDL(create,alter,drop)
    *               3.ResultSet executeQuery(String sql):执行DQL(select)语句
    *
    *
    *
    *
    *
    *
    * 4.ResultSet:结果集对象
    *           next(); //游标向下移动一行
    *           getXXX(); 获取数据
    *               XXX是数据类型
    *               参数:
    *                   int:代表列的编号,从1开始 如:getString(1);
    *                   String:代表列名称。  如:getDouble("balance");
    * 5.PreparedStatement:执行sql的对象
    *
    *
    *
    *
    *
    * */
}
