package org.example;

import com.training.entities.Student;
import com.training.repositories.StudentDAO;
import com.training.util.DBCon;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws SQLException
    {
        Scanner sc=new Scanner(System.in);
        DBCon.getConnection();
        StudentDAO dao=new StudentDAO();
        System.out.println(dao.getAll());
        System.out.println(dao.getById(2));
        System.out.println(dao.getByEmail("sona26@gmail.com"));
        //update
        dao.updateStudent("tom@gmail.com","Tom");
        //Add new Student
        System.out.println("Add following details of student:");
        System.out.println("Add roll no.");
        int rno=sc.nextInt();
        System.out.println("Add name:");
        String sname=sc.next();
        System.out.println("Add email:");
        String email=sc.next();
        dao.addNewStud(rno,sname,email);

    }
}