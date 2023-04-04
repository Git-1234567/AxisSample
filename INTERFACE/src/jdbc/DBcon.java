package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
    public static Connection getConnection() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Deepu@14");
        return con;
    }

    public static void main(String[] args) throws SQLException{
        Connection con=getConnection();
        System.out.println(con);
    }
}
