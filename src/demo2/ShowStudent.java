package demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args){
        // viết code nhập vào id của 1 người và tìm trong db dữ liệu sinh viên đó
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID sinh viên: ");
            int id = scanner.nextInt();

            // ket noi db
            String connectionString = "jdbc:mysql://localhost:3306/t2409m_jp";
            String username = "root";
            String password = "root"; // dùng xampp: ""
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,username,password);
            System.out.println("Connected Database!");
            Statement stt = conn.createStatement();
//             GET DATA
            String query = "SELECT * FROM students WHERE id = " + id;
            ResultSet rs = stt.executeQuery(query);
            Student s = null;
            while (rs.next()) {
                Integer studentId = rs.getInt("id");
                String name = rs.getString("name");
                String telephone = rs.getString("telephone");
                Integer age = rs.getInt("age");
                s = new Student(id,name,age,telephone);
            }
            s.showInfo();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
