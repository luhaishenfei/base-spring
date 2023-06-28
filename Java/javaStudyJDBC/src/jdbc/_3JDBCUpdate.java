package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _3JDBCUpdate {
    public static void main(String[] args) {
        System.out.println(updateSql( "  delete from stu   where   id=99 "));
    }
    public static int updateSql(String sql){
        Statement statement = null;
        Connection conn = null;
        int count =-1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123");
            statement = conn.createStatement();
            count = statement.executeUpdate(sql);
            if (count>0){
                System.out.println("sql执行成功");
            }else {
                System.out.println("sql执行失败");
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
            return count;


        }
    }
}

