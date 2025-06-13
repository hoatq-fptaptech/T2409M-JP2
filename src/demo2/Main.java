package demo2;

import dao.StudentDAOImpl;
import database.Connector;
import entity.Student;
import entity.Subject;
import factory.DaoFactory;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        try{
            ArrayList<Student> listStudent = DaoFactory.getDAO("student").all();
            for (Student s : listStudent){
                s.showInfo();
            }
            ArrayList<Subject> listSubjects = DaoFactory.getDAO("subject").all();

            // INSERT DATA
//            String insert_sql = "insert into students(name,age,telephone) values('Nguyễn Huy Long',19,'0988888888')";
//            stt.executeUpdate(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
