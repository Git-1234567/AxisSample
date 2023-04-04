package com.training.repositories;

import com.training.entities.Student;
import com.training.util.DBCon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

    public ArrayList<Student> getAll()
    {
        ArrayList<Student> slist=new ArrayList<>();
        Student s;
        try {//database

            Statement st = DBCon.con.createStatement();
            ResultSet r= st.executeQuery("select * from student");
            while (r.next()) {
    //preparing the student object
                s=new Student();
                s.setRno(r.getInt(1));
                s.setSname(r.getString(2));
                s.setEmail(r.getString(3));
    //adding to arraylist
                slist.add(s);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    //returning the arraylist of objects
        return slist;
    }
    public Student getById(int ID)
    {
        Student s=null;
        try {
            String query="SELECT * FROM student where rno=?";
            PreparedStatement pstmt = DBCon.con.prepareStatement(query);
            pstmt.setInt(1,ID);
            ResultSet r = pstmt.executeQuery();
            while (r.next()) {
                s=new Student();
                s.setRno(r.getInt(1));
                s.setSname(r.getString(2));
                s.setEmail(r.getString(3));
            }
        }catch(SQLException se)
        {
            throw new RuntimeException(se);
        }
        return s;
    }
    public Student getByEmail(String email)
    {
        Student s1=null;

        try{
            String query="SELECT * FROM student where email=?";
            PreparedStatement pstmt = DBCon.con.prepareStatement(query);
            pstmt.setString(1,email);
            ResultSet r = pstmt.executeQuery();
            while (r.next()) {
                s1=new Student();
                s1.setRno(r.getInt(1));
                s1.setSname(r.getString(2));
                s1.setEmail(r.getString(3));
            }
        }catch (SQLException se)
        {
            throw new RuntimeException(se);
        }
        return s1;
    }
    public void addNewStud(int rno,String sname,String email)
    {
        ResultSet rs;
        try{
            Statement st=DBCon.con.createStatement();
            rs=st.executeQuery("SELECT * FROM student WHERE rno="+rno);
            if(rs.next())
            {
                System.out.println("The Student with roll no.= "+rno+" is already exist!!");
            }
            else {
                String query="INSERT INTO student VALUES('"+rno+"','"+sname+"','"+email+"')";
                int ret=st.executeUpdate(query);
                if(ret>0)
                {
                    System.out.println("Successfully inserted!!");
                }
                else {
                    System.out.println("Something went wrong!!");
                }
            }
        }catch(SQLException se)
        {
            throw new RuntimeException(se);
        }
    }
    public void updateStudent(String email, String sname)
    {
        try{
            String query="update student set email=? where sname=?";
            PreparedStatement pstmt=DBCon.con.prepareStatement(query);
            pstmt.setString(1,email);
            pstmt.setString(2,sname);
            int rowUpdate=pstmt.executeUpdate();
            if(rowUpdate>0)
            {
                System.out.println("Record updated successfully!!");
            }
        }catch (SQLException se)
        {
            throw new RuntimeException(se);
        }

    }
}
