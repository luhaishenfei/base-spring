package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _2JdbcBasicOpration {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123");
            statement = conn.createStatement();
//            String sql = "insert into stu(id,NAME) values(120,\"xiaolu\")";
  //    String sql = "  update  stu  set   NAME=\"zhuhaowen\"   where   NAME=\"xiaolu\"   ";
            String sql = "  delete from stu   where   id=100 ";

            int count = statement.executeUpdate(sql);
            System.out.println(count);
            if (count>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
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

        }

    }
}
