package demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
//             GET DATA
            String sql = "select * from students";
            ResultSet rs = stt.executeQuery(sql);

            ArrayList<Student> listStudent = new ArrayList<>();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String telephone = rs.getString("telephone");
                Integer age = rs.getInt("age");
                Student s = new Student(id,name,age,telephone);
                listStudent.add(s);
            }

            for (Student s : listStudent){
                s.showInfo();
            }

            // INSERT DATA
//            String insert_sql = "insert into students(name,age,telephone) values('Nguyễn Huy Long',19,'0988888888')";
//            stt.executeUpdate(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
