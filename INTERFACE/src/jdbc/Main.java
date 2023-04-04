package jdbc;

import java.sql.*;

public class Main {
    public static Connection getConnection() throws SQLException{
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Deepu@14");
        System.out.println(con);
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from emp");
        while(r.next())
        {
            System.out.println(1+" "+r.getString(2)+" "+r.getString(3));
        }
        return con;
    }

    public static void main(String[] args) throws SQLException{
        Main m=new Main();
        getConnection();
    }
}
