package demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        try{
            // ket noi db
            String connectionString = "jdbc:mysql://localhost:3306/t2409m_jp";
            String username = "root";
            String password = "root"; // dùng xampp: ""
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,username,password);
            System.out.println("Connected Database!");
            Statement stt = conn.createStatement();
            // GET DATA
//            String sql = "select * from students";
//            ResultSet rs = stt.executeQuery(sql);
//            while (rs.next()){
//                String name = rs.getString("name");
//                String telephone = rs.getString("telephone");
//                Integer age = rs.getInt("age");
//                System.out.println(name);
//                System.out.println(telephone);
//                System.out.println(age);
//            }

            // INSERT DATA
            String insert_sql = "insert into students(name,age,telephone) values('Nguyễn Huy Long',19,'0988888888')";
            stt.executeUpdate(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
