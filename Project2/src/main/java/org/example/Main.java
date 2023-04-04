package org.example;

import java.sql.*;

public class Main {

    public static Connection getConnection() throws SQLException{
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Deepu@14");
        System.out.println(con);
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("SELECT * from employee");
        while(r.next())
        {
            System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
        }
        return con;
}

    public static void main(String[] args) throws SQLException{
        Main m=new Main();
        getConnection();

    }
}
