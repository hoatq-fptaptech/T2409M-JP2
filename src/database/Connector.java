package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    private String connectionString = "jdbc:mysql://localhost:3306/t2409m_jp";
    private String username = "root";
    private String password = "root";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;

    public Connector() {
        try {
            Class.forName(driver);
            this.conn = DriverManager.getConnection(connectionString,username,password);
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
    }

    public Statement createStatement() throws SQLException {
        return conn.createStatement();
    }
}
