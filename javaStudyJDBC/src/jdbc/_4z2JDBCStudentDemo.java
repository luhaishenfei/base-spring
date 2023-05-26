package jdbc;

import java.sql.*;

public class _4z2JDBCStudentDemo {
    public static void main(String[] args) {

    }

    public static void exsql(String sql) {
        Statement statement = null;
        Connection conn = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123");
            statement = conn.createStatement();
            //执行sql
            resultSet = statement.executeQuery(sql);


            //处理结果
            System.out.println(resultSet);
            //1.让游标向下移动一行
            //resultSet.next();

            //1plus.  循环判断是否有下一行
            while (resultSet.next()) {
                //2.获取数据
                int id = resultSet.getInt(1);
                String NAME = resultSet.getString(2);
                int age = resultSet.getInt(3);
                System.out.println(id + " " + NAME + " " + age);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
